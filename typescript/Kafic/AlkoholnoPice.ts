import { Pice } from './Pice'
import { Ukus } from './Ukus'

export class AlkoholnoPice extends Pice {
  protected brojPromila: number;

  public getBrojPromila(): number {
      return this.brojPromila;
  }

  public constructor(naziv: string,brend: string, ukus: Ukus) {
      super();
  }

  public setBrojPromila(brojPromila: number): void {
      this.brojPromila = brojPromila;
  }

  public isJakoPice(): boolean {
      return this.brojPromila > 10;
  }

  public opisiPice(): void {
      super.opisiPice();
      console.log("Broj promila: " + this.brojPromila + "%");
  }
}
