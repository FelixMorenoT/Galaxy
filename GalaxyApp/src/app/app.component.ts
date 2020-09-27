import { Component, OnInit } from '@angular/core';
import { AstronautService } from './services/astronaut.service';
import { Astronaut } from 'src/dao/astronaut';
import { Planet } from 'src/dao/planet';
import { PlanetService } from './services/planet.service';
import { TopService } from './services/top.service';
import { FormControl, NgForm } from '@angular/forms';
import { FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
 formGroup: FormGroup; 
  title = 'GalaxyApp';

  constructor(
      private astronautService: AstronautService,
      private planetService: PlanetService,
      private topService: TopService,
  ) { }
 
  ngOnInit(): void {
    let tempAstronaut = new Astronaut('Felix','Moreno','25','1.60cm','80kg','Masculino','14/05/1995','O+');
    let tempPlanet = new Planet('Mars','24h','12742km','Tropical','Forest');
    //this.astronautService.saveAstronaut(tempAstronaut).subscribe((response) => {console.log("Save"); console.log(response)})
    //this.astronautService.getAstronaut().subscribe((response) => { console.log("GET"); console.log(response)})
    //this.astronautService.setHome('2','1').subscribe((response) => {console.log(response)})
    //this.astronautService.visitAnAstronaut('1','2').subscribe((response) => {console.log(response)})
    //this.planetService.getPlanets().subscribe((response) => {console.log("GET"); console.log(response)})

    //this.topService.getTops().subscribe((response) => {console.log(response)});

  }
  
   onClickSubmit(f: NgForm) {
      this.astronautService.saveAstronaut(f.value).subscribe((response) => {console.log("Save"); console.log(response)})
   }
}
