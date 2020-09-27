import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { map } from 'rxjs/operators';
import { Observable } from 'rxjs/internal/Observable';
import { Astronaut } from 'src/dao/astronaut';


@Injectable({
  providedIn: 'root'
})
export class AstronautService {
   private endPoint: string = 'http://localhost:8080/galaxy/';
   constructor(private http: HttpClient) { }

  getAstronaut(): Observable<Astronaut> {
    return this.http.get(this.endPoint + 'astronaut')
            .pipe(map((response: Astronaut) =>  response));
  }

  saveAstronaut(localAstronaut: Astronaut): Observable<any> {
    return this.http.post(this.endPoint + 'astronaut', localAstronaut);
  }

  setHome(idAstronaut: string, idPlanet: string): Observable<any> {
    return this.http.post(this.endPoint + 'planet/' + idAstronaut + '/' + idPlanet, '');
  }

  visitAnAstronaut(idToAstronaut: string, idFromAstronaut: string): Observable<any> {
    return this.http.patch(this.endPoint + 'astronaut' + '/' + idToAstronaut + '/' + idFromAstronaut, '');
  }
}
