export class AstronautTop {
	astronautName: string;
	astronautLastName: string;
	astronautVisit: number;

	constructor(name: string , last: string, visit: number){
		this.astronautName = name;
		this.astronautLastName = last;
		this.astronautVisit = visit;
	}
}