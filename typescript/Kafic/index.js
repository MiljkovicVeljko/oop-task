var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Ukus;
(function (Ukus) {
    Ukus[Ukus["VOCNO"] = 0] = "VOCNO";
    Ukus[Ukus["NEUTRALNO"] = 1] = "NEUTRALNO";
    Ukus[Ukus["GORKO"] = 2] = "GORKO";
    Ukus[Ukus["KISELO"] = 3] = "KISELO";
})(Ukus || (Ukus = {}));
var Pice = /** @class */ (function () {
    function Pice() {
    }
    Pice.prototype.setUkus = function (ukus) {
        this.ukus = ukus;
    };
    Pice.prototype.Pice = function (naziv, brend, ukus) {
        this.naziv = naziv;
        this.brend = brend;
        this.ukus = ukus;
    };
    Pice.prototype.getNaziv = function () {
        return this.naziv;
    };
    Pice.prototype.setNaziv = function (naziv) {
        this.naziv = naziv;
    };
    Pice.prototype.getBrend = function () {
        return this.brend;
    };
    Pice.prototype.setBrend = function (brend) {
        this.brend = brend;
    };
    Pice.prototype.getUkus = function () {
        return this.ukus;
    };
    Pice.prototype.opisiPice = function () {
        console.log("Pice " + this.naziv + " | " + this.brend + ",ukus: " + this.ukus);
    };
    return Pice;
}());
var BezalkoholnoPice = /** @class */ (function (_super) {
    __extends(BezalkoholnoPice, _super);
    function BezalkoholnoPice(naziv, brend, ukus) {
        return _super.call(this) || this;
    }
    BezalkoholnoPice.prototype.opisiPice = function () {
        _super.prototype.opisiPice.call(this);
        console.log("Energetysko: " + this.energetsko);
    };
    BezalkoholnoPice.prototype.isEnergetsko = function () {
        return this.energetsko;
    };
    BezalkoholnoPice.prototype.setEnergetsko = function (energetsko) {
        this.energetsko = energetsko;
    };
    return BezalkoholnoPice;
}(Pice));
var AlkoholnoPice = /** @class */ (function (_super) {
    __extends(AlkoholnoPice, _super);
    function AlkoholnoPice(naziv, brend, ukus) {
        return _super.call(this) || this;
    }
    AlkoholnoPice.prototype.getBrojPromila = function () {
        return this.brojPromila;
    };
    AlkoholnoPice.prototype.setBrojPromila = function (brojPromila) {
        this.brojPromila = brojPromila;
    };
    AlkoholnoPice.prototype.isJakoPice = function () {
        return this.brojPromila > 10;
    };
    AlkoholnoPice.prototype.opisiPice = function () {
        _super.prototype.opisiPice.call(this);
        console.log("Broj promila: " + this.brojPromila + "%");
    };
    return AlkoholnoPice;
}(Pice));
// MAIN
var alkoholnoPice1 = new AlkoholnoPice("Vino", "Kovacevic", Ukus.KISELO);
alkoholnoPice1.setBrojPromila(13);
alkoholnoPice1.opisiPice();
var alkoholnoPice2 = new AlkoholnoPice("Rakija", "Dedina", Ukus.GORKO);
alkoholnoPice2.setBrojPromila(40);
alkoholnoPice2.opisiPice();
var bezalkoholnoPice1 = new BezalkoholnoPice("Jagoda", "Next", Ukus.VOCNO);
bezalkoholnoPice1.setEnergetsko(false);
bezalkoholnoPice1.opisiPice();
var bezalkoholnoPice2 = new BezalkoholnoPice("Redbull", "Redbnul;l", Ukus.VOCNO);
bezalkoholnoPice2.setEnergetsko(true);
bezalkoholnoPice2.opisiPice();
