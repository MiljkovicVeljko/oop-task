"use strict";
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
Object.defineProperty(exports, "__esModule", { value: true });
exports.AlkoholnoPice = void 0;
var Pice_1 = require("./Pice");
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
}(Pice_1.Pice));
exports.AlkoholnoPice = AlkoholnoPice;
