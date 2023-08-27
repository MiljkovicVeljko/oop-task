import { Ukus } from './Ukus'
import { Pice } from './Pice'

export class BezalkoholnoPice extends Pice {
  protected energetsko: boolean;

  constructor(naziv: string, brend: string, ukus: Ukus) {
      super();
  }

  public opisiPice(): void {
      super.opisiPice();
      console.log("Energetysko: " + this.energetsko);
  }

  public isEnergetsko(): boolean {
      return this.energetsko;
  }

  public setEnergetsko(energetsko: boolean) : void {
      this.energetsko = energetsko;
  }
}
