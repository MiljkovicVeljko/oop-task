enum Ukus {
  VOCNO, NEUTRALNO, GORKO, KISELO
}

class Pice {
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
}

class BezalkoholnoPice extends Pice {
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



class AlkoholnoPice extends Pice {
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


// MAIN

const alkoholnoPice1: AlkoholnoPice = new AlkoholnoPice("Vino", "Kovacevic", Ukus.KISELO);
alkoholnoPice1.setBrojPromila(13);
alkoholnoPice1.opisiPice();

const alkoholnoPice2: AlkoholnoPice = new AlkoholnoPice("Rakija", "Dedina", Ukus.GORKO);
alkoholnoPice2.setBrojPromila(40);
alkoholnoPice2.opisiPice();



const bezalkoholnoPice1: BezalkoholnoPice = new BezalkoholnoPice("Jagoda", "Next", Ukus.VOCNO);
bezalkoholnoPice1.setEnergetsko(false);
bezalkoholnoPice1.opisiPice();

const bezalkoholnoPice2: BezalkoholnoPice = new BezalkoholnoPice("Redbull", "Redbnul;l", Ukus.VOCNO);
bezalkoholnoPice2.setEnergetsko(true);
bezalkoholnoPice2.opisiPice();
