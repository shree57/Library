import { Component, OnInit } from '@angular/core';
import { LibraryServiceService } from '../library-service.service';
import { Library } from '../library';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Book } from '../book';

@Component({
  selector: 'app-library',
  templateUrl: './library.component.html',
  styleUrls: ['./library.component.css']
})
export class LibraryComponent implements OnInit {

  constructor(private LibService:LibraryServiceService, private router: Router) { }

  libs:Observable<Library[]>
  books:Book[];
  lib:Library=new Library();
  ngOnInit() {
    console.log("ready for load the data");
    this.LibService.getlibList().subscribe(data =>{  
      this.libs =data;  
        })  
     
  }

  viewbooks(books){
    console.log("readyyyyyyyy : "+books);
    this.LibService.getbooks(books);
this.router.navigate(['/books']);
  }

}
