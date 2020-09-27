export class Astronaut {
astronautId: number;
astronautName: string;
astronautLastName: string;
astronautAge: string;
astronautHigh: string;
astronautWeight: string;
astronautGender: string;
astronautBirth: string;
astronautRH: string;
hasHome: boolean;
astronautCountVisit: number;

	constructor(name: string, last: string, age: string, high: string, weight: string, gender: string, birth: string, rh: string) {
		this.astronautName = name;
		this.astronautLastName = last;
		this.astronautAge = age;
		this.astronautHigh = high;
		this.astronautWeight = weight;
		this.astronautGender = gender;
		this.astronautBirth = birth;
		this.astronautRH = rh;
	}
}