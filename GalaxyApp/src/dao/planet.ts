export class Planet {

    planetName: string;
    planetRotationTime: string;
    planetDiameter: string;
    planetWeather: string;
    planetTerrain: string;

	constructor(name: string, rotation: string, diameter: string, weather: string, terrain: string){
		this.planetName = name;
		this.planetRotationTime = rotation;
		this.planetDiameter = diameter;
		this.planetWeather = weather;
		this.planetTerrain = terrain;
	}

}