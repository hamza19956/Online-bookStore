import { Component, OnInit } from '@angular/core';
import { from } from 'rxjs';
import { Book } from 'src/app/common/book';
import { BookService } from 'src/app/services/book.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-grid.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books: Book[];
  currentId : number;

  constructor(private _bookService: BookService,
              private _activetedRoute : ActivatedRoute) { }

  ngOnInit(): void {
    this._activetedRoute.paramMap.subscribe(()=>{this.consumeBooks();})
    
  }
  consumeBooks() {

 const isCategoryId:boolean = this._activetedRoute.snapshot.paramMap.has('id');
 if(isCategoryId){
   this.currentId = +this._activetedRoute.snapshot.paramMap.get('id');
 }else{
   this.currentId = 1;
 }



    this._bookService.getBooks(this.currentId).subscribe(
      data => this.books = data
    )
  }
}
