import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
import { Top } from 'src/dao/top';

@Injectable({
  providedIn: 'root'
})
export class TopService {
  private endPoint: string = 'http://localhost:8080/galaxy/';
  constructor(private http: HttpClient) { }

  getTops(): Observable<any> {
  return this.http.get(this.endPoint + 'top')
          .pipe(map((response: any) =>  response));
  }

}
