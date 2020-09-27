import { PlanetTop } from './planettop';
import { AstronautTop } from './astronauttop';

export class Top {
	topPlanets: PlanetTop[];
	topAstronaut: AstronautTop[];

	public getTopAstronaut(): AstronautTop[] {
			return this.topAstronaut;
	}

	public getTopPlanets(): PlanetTop[] {
			return this.topPlanets;
	}

	public setTopAstronaut(tempTopAstronaut: AstronautTop[]): void {
		this.topAstronaut = tempTopAstronaut;
	}

	public setTopPlanets(tempTopPlanets: PlanetTop[]): void {
		this.topPlanets = tempTopPlanets;
	}
}