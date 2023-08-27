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
exports.BezalkoholnoPice = void 0;
var Pice_1 = require("./Pice");
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
}(Pice_1.Pice));
exports.BezalkoholnoPice = BezalkoholnoPice;
