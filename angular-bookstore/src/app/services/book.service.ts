import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Book } from '../common/book';

@Injectable({
  providedIn: 'root'
})
export class BookService {
  private baseUrl ="http://localhost:8080/api/v1/books"; //We can specify number of data ,20 is defoult
  constructor(private httpClient:HttpClient) { }

  getBooks(theBookCategory:number): Observable<Book[]> {
    const searchUrl = `${this.baseUrl}/search/categoryId?id=${theBookCategory}`;
    return this.httpClient.get<getResponseBook>(searchUrl).pipe(
      map(response => response._embedded.books)
    );
  }
}

interface getResponseBook{
  _embedded : {
    books : Book[] ;
  }
}
