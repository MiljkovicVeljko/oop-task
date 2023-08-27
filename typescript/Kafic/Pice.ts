import { Ukus } from './Ukus';

export class Pice {
  protected naziv: string;
  protected brend: string;
  protected ukus: Ukus;

  public setUkus(ukus: Ukus): void {
      this.ukus = ukus;
  }

  public Pice(naziv: string, brend: string, ukus: Ukus) {
      this.naziv = naziv;
      this.brend = brend;
      this.ukus = ukus;
  }

  public getNaziv(): string {
      return this.naziv;
  }

  public setNaziv(naziv: string): void {
      this.naziv = naziv;
  }

  public getBrend(): string {
      return this.brend;
  }

  public setBrend(brend: string) : void{
      this.brend = brend;
  }

  public getUkus(): Ukus {
      return this.ukus;
  }

  public opisiPice(): void {
      console.log("Pice " + this.naziv + " | " + this.brend + ",ukus: " + this.ukus);
  }

  // @Override
  // public boolean equals(Object obj) {
  //     if (obj instanceof Pice == false) {
  //         return false;
  //     }
  //     Pice p = (Pice) obj;
  //     if (this.naziv.equals(p.naziv) && this.brend.equals(p.brend) && this.ukus.equals(p.ukus)) {
  //         return true;
  //     }
  //     return false;
  // }
}
