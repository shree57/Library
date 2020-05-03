import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';  
import { Observable } from 'rxjs';  
import { Library } from './library';
import { Book } from './book';

@Injectable({
  providedIn: 'root'
})
export class LibraryServiceService {

  private baseUrl = 'http://localhost:8080/';  
  
  constructor(private http:HttpClient) { }  
  private books:Book[];
  
  getlibList(): Observable<any> {  
    console.log("data in service");
    return this.http.get(`${this.baseUrl}`+'getall');  
  }  
  
  getbooks(book){
    this.books=book
  }
  
  getData(){
     return this.books;
  }

  getlib(id: number): Observable<Object> {  
    return this.http.get(`${this.baseUrl}/lib/${id}`);  
  }  
}
