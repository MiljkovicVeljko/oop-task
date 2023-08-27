"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Pice = void 0;
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
exports.Pice = Pice;
