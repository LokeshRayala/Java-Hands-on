import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { UserClass } from './UserClass';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  url:string="http://localhost:8082/api/user/";

  headers = new HttpHeaders().set('Content-Type', 'application/json');



  //inject the DI
  constructor(private http: HttpClient) { }


  //get all users
  getAllUser():Observable<UserClass[]>{
      return this.http.get<UserClass[]>(this.url);
  }

  //delete user by id
  deletePost(id:number) {
    let endPoints = id;
    this.http.delete(this.url + endPoints).subscribe(data => {
       return this.getAllUser();
    });
  }
  
  
  //post
  create(data: any): Observable<any> {
    return this.http.post(this.url, data).pipe(
      catchError(this.handleError)
      );
  }

   // Handle API errors
  handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      console.error('An error occurred:', error.error.message);
    } else {
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    return throwError(
      'Something bad happened; please try again later.');
  };

}
