import { Component, OnInit, ViewChild } from '@angular/core';
import { LibraryComponent } from '../library/library.component';
import { LibraryServiceService } from '../library-service.service';
import { Book } from '../book';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
 
books:Book[];
  
  constructor(private LibService:LibraryServiceService) { }
  
  ngOnInit() {
    
    this.books=this.LibService.getData();
    console.log("bookssss : "+this.books);
  }

  
}
