import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Planet } from 'src/dao/planet';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PlanetService {
  private endPoint: string = 'http://localhost:8080/galaxy/';
  constructor(private http: HttpClient) { }

  getPlanets(): Observable<Planet> {
  return this.http.get(this.endPoint + 'planet')
          .pipe(map((response: Planet) =>  response));
  }

  savePlanet(planet: Planet): Observable<any> {
    return this.http.post(this.endPoint + 'planet', planet);
  }

  visitAPlanet(idAstronaut: string, idPlanet: string): Observable<any> {
    return this.http.patch(this.endPoint + 'planet' + '/' + idAstronaut + '/' + idPlanet, '');
  }

}
