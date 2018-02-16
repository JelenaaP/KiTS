webpackJsonp(["main"],{

/***/ "../../../../../src/$$_lazy_route_resource lazy recursive":
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "../../../../../src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "../../../../../src/app/app.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/app.component.html":
/***/ (function(module, exports) {

module.exports = "<div style=\"text-align:center\">\r\n  <h1>\r\n    Sistem za odrzavanje zgrada!\r\n  </h1>\r\n  <nav class=\"navbar navbar-toggleable-md navbar-light bg-faded\">\r\n    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n      <ul class=\"navbar-nav mr-auto\">\r\n        <li routerLinkActive=\"active current\">\r\n          <a class=\"nav-link\" [routerLink]=\"['/zgrade']\">Zgrade</a>\r\n          <a class=\"nav-link\" [routerLink]=\"['/stanovi']\">Stanovi</a>\r\n          <a class=\"nav-link\" [routerLink]=\"['/firme']\">Firme</a>\r\n        </li>\r\n       </ul>\r\n    </div>   \r\n  </nav>\r\n</div>\r\n<router-outlet></router-outlet>"

/***/ }),

/***/ "../../../../../src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
    }
    AppComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-root',
            template: __webpack_require__("../../../../../src/app/app.component.html"),
            styles: [__webpack_require__("../../../../../src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "../../../../../src/app/app.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__("../../../platform-browser/esm5/platform-browser.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__("../../../forms/esm5/forms.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_http__ = __webpack_require__("../../../http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__app_routing__ = __webpack_require__("../../../../../src/app/app.routing.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_map__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/map.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__app_component__ = __webpack_require__("../../../../../src/app/app.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__zgrade_zgrade_component__ = __webpack_require__("../../../../../src/app/zgrade/zgrade.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__zgrade_zgrada_service__ = __webpack_require__("../../../../../src/app/zgrade/zgrada.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__stanovi_stanovi_component__ = __webpack_require__("../../../../../src/app/stanovi/stanovi.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__stanovi_stan_service__ = __webpack_require__("../../../../../src/app/stanovi/stan.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__firme_firme_component__ = __webpack_require__("../../../../../src/app/firme/firme.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__firme_firma_service__ = __webpack_require__("../../../../../src/app/firme/firma.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__ng_bootstrap_ng_bootstrap__ = __webpack_require__("../../../../@ng-bootstrap/ng-bootstrap/index.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};














var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_1__angular_core__["J" /* NgModule */])({
            declarations: [
                __WEBPACK_IMPORTED_MODULE_6__app_component__["a" /* AppComponent */],
                __WEBPACK_IMPORTED_MODULE_7__zgrade_zgrade_component__["a" /* ZgradeComponent */],
                __WEBPACK_IMPORTED_MODULE_9__stanovi_stanovi_component__["a" /* StanoviComponent */],
                __WEBPACK_IMPORTED_MODULE_11__firme_firme_component__["a" /* FirmeComponent */]
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_13__ng_bootstrap_ng_bootstrap__["a" /* NgbModule */].forRoot(),
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_3__angular_http__["c" /* HttpModule */],
                __WEBPACK_IMPORTED_MODULE_4__app_routing__["a" /* routing */]
            ],
            providers: [__WEBPACK_IMPORTED_MODULE_8__zgrade_zgrada_service__["a" /* ZgradaService */], __WEBPACK_IMPORTED_MODULE_10__stanovi_stan_service__["a" /* StanService */], __WEBPACK_IMPORTED_MODULE_12__firme_firma_service__["a" /* FirmaService */]],
            bootstrap: [__WEBPACK_IMPORTED_MODULE_6__app_component__["a" /* AppComponent */]],
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "../../../../../src/app/app.routing.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return routing; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__zgrade_zgrade_component__ = __webpack_require__("../../../../../src/app/zgrade/zgrade.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__stanovi_stanovi_component__ = __webpack_require__("../../../../../src/app/stanovi/stanovi.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__firme_firme_component__ = __webpack_require__("../../../../../src/app/firme/firme.component.ts");




var routes = [
    { path: 'zgrade', component: __WEBPACK_IMPORTED_MODULE_1__zgrade_zgrade_component__["a" /* ZgradeComponent */] },
    { path: 'stanovi', component: __WEBPACK_IMPORTED_MODULE_2__stanovi_stanovi_component__["a" /* StanoviComponent */] },
    { path: 'firme', component: __WEBPACK_IMPORTED_MODULE_3__firme_firme_component__["a" /* FirmeComponent */] },
    { path: '**', redirectTo: '' }
];
var routing = __WEBPACK_IMPORTED_MODULE_0__angular_router__["b" /* RouterModule */].forRoot(routes);


/***/ }),

/***/ "../../../../../src/app/firme/firma.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return FirmaService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__("../../../http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__ = __webpack_require__("../../../../rxjs/_esm5/Rx.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/toPromise.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var FirmaService = /** @class */ (function () {
    function FirmaService(http) {
        this.http = http;
        this.firmeUrl = 'api/firma';
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        this.RegenerateData = new __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__["a" /* Subject */]();
        this.RegenerateData$ = this.RegenerateData.asObservable();
    }
    FirmaService.prototype.announceChange = function () {
        this.RegenerateData.next();
    };
    FirmaService.prototype.getFirme = function () {
        return this.http.get(this.firmeUrl)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    FirmaService.prototype.getFirma = function (id) {
        var url = this.firmeUrl + "/" + id;
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    FirmaService.prototype.addFirma = function (firma) {
        return this.http
            .post(this.firmeUrl, JSON.stringify(firma), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    FirmaService.prototype.editZgrada = function (firma) {
        return this.http
            .put(this.firmeUrl, JSON.stringify(firma), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    FirmaService.prototype.deleteFirma = function (firmaId) {
        var url = this.firmeUrl + "/" + firmaId;
        return this.http
            .delete(url)
            .toPromise()
            .catch(this.handleError);
    };
    FirmaService.prototype.handleError = function (error) {
        console.error("Error... ", error);
        return Promise.reject(error.message || error);
    };
    FirmaService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]])
    ], FirmaService);
    return FirmaService;
}());



/***/ }),

/***/ "../../../../../src/app/firme/firme.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/firme/firme.component.html":
/***/ (function(module, exports) {

module.exports = "<div>\r\n    <h3>Firme</h3>\r\n  </div>\r\n  <table class=\"table table-bordered\">\r\n    <tr>\r\n      <th>Ime</th>\r\n      <th></th>\r\n    </tr>\r\n    <tr *ngFor=\"let firma of firme\">\r\n      <td>\r\n        {{firma.ime}}\r\n      </td>\r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Edit\" (click)=\"gotoEdit(zgrada)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteZgrada(zgrada.id)\">\r\n          <span class=\"fa fa-remove\" aria-hidden=\"true\"></span>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\"></span>\r\n    </button>\r\n  </div> \r\n  "

/***/ }),

/***/ "../../../../../src/app/firme/firme.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return FirmeComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__firma_service__ = __webpack_require__("../../../../../src/app/firme/firma.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var FirmeComponent = /** @class */ (function () {
    function FirmeComponent(firmaService, router) {
        var _this = this;
        this.firmaService = firmaService;
        this.router = router;
        this.subscription = firmaService.RegenerateData$.subscribe(function () {
            return _this.getFirme();
        });
    }
    FirmeComponent.prototype.ngOnInit = function () {
        this.getFirme();
    };
    FirmeComponent.prototype.getFirme = function () {
        var _this = this;
        this.firmaService.getFirme().then(function (firme) {
            return _this.firme = firme;
        });
    };
    FirmeComponent.prototype.gotoAdd = function () {
        this.router.navigate(['/addFirma']);
    };
    FirmeComponent.prototype.gotoEdit = function (firma) {
        this.router.navigate(['/editFirma', firma.id]);
    };
    FirmeComponent.prototype.deleteFirma = function (firmaId) {
        var _this = this;
        this.firmaService.deleteFirma(firmaId).then(function () { return _this.getFirme(); });
    };
    FirmeComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'firme-list',
            template: __webpack_require__("../../../../../src/app/firme/firme.component.html"),
            styles: [__webpack_require__("../../../../../src/app/firme/firme.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__firma_service__["a" /* FirmaService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* Router */]])
    ], FirmeComponent);
    return FirmeComponent;
}());



/***/ }),

/***/ "../../../../../src/app/stanovi/stan.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StanService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__("../../../http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__ = __webpack_require__("../../../../rxjs/_esm5/Rx.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/toPromise.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var StanService = /** @class */ (function () {
    function StanService(http) {
        this.http = http;
        this.stanoviUrl = 'api/stan';
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        this.RegenerateData = new __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__["a" /* Subject */]();
        this.RegenerateData$ = this.RegenerateData.asObservable();
    }
    StanService.prototype.announceChange = function () {
        this.RegenerateData.next();
    };
    StanService.prototype.getStanovi = function () {
        return this.http.get(this.stanoviUrl)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    StanService.prototype.getStan = function (id) {
        var url = this.stanoviUrl + "/" + id;
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    StanService.prototype.addStan = function (stan) {
        return this.http
            .post(this.stanoviUrl, JSON.stringify(stan), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    StanService.prototype.editStan = function (stan) {
        return this.http
            .put(this.stanoviUrl, JSON.stringify(stan), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    StanService.prototype.deleteStan = function (stanId) {
        var url = this.stanoviUrl + "/" + stanId;
        return this.http
            .delete(url)
            .toPromise()
            .catch(this.handleError);
    };
    StanService.prototype.handleError = function (error) {
        console.error("Greska...", error);
        return Promise.reject(error.message || error);
    };
    StanService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]])
    ], StanService);
    return StanService;
}());



/***/ }),

/***/ "../../../../../src/app/stanovi/stanovi.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/stanovi/stanovi.component.html":
/***/ (function(module, exports) {

module.exports = "<div>\r\n    <h3>Stanovi</h3>\r\n  </div>\r\n  <table class=\"table table-bordered\">\r\n    <tr>\r\n      <th>Ime</th>\r\n      <th></th>\r\n    </tr>\r\n    <tr *ngFor=\"let stan of stanovi\">\r\n      <td>\r\n        {{stan.ime}}\r\n      </td>\r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Edit\" (click)=\"gotoEdit(stan)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteStan(stan.id)\">\r\n          <span class=\"fa fa-remove\" aria-hidden=\"true\"></span>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\"></span>\r\n    </button>\r\n  </div> \r\n  "

/***/ }),

/***/ "../../../../../src/app/stanovi/stanovi.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StanoviComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__stan_service__ = __webpack_require__("../../../../../src/app/stanovi/stan.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var StanoviComponent = /** @class */ (function () {
    function StanoviComponent(stanService, router) {
        var _this = this;
        this.stanService = stanService;
        this.router = router;
        this.subscription = stanService.RegenerateData$.subscribe(function () {
            return _this.getStanovi();
        });
    }
    StanoviComponent.prototype.ngOnInit = function () {
        this.getStanovi();
    };
    StanoviComponent.prototype.getStanovi = function () {
        var _this = this;
        this.stanService.getStanovi().then(function (stanovi) {
            return _this.stanovi = stanovi;
        });
    };
    StanoviComponent.prototype.gotoAdd = function () {
        this.router.navigate(['/addStan']);
    };
    StanoviComponent.prototype.gotoEdit = function (stan) {
        this.router.navigate(['/editStan', stan.id]);
    };
    StanoviComponent.prototype.deleteStan = function (stanId) {
        var _this = this;
        this.stanService.deleteStan(stanId).then(function () { return _this.getStanovi(); });
    };
    StanoviComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'stanovi-list',
            template: __webpack_require__("../../../../../src/app/stanovi/stanovi.component.html"),
            styles: [__webpack_require__("../../../../../src/app/stanovi/stanovi.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__stan_service__["a" /* StanService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* Router */]])
    ], StanoviComponent);
    return StanoviComponent;
}());



/***/ }),

/***/ "../../../../../src/app/zgrade/zgrada.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ZgradaService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__("../../../http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__ = __webpack_require__("../../../../rxjs/_esm5/Rx.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/toPromise.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var ZgradaService = /** @class */ (function () {
    function ZgradaService(http) {
        this.http = http;
        this.zgradeUrl = 'api/zgrada';
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        this.RegenerateData = new __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__["a" /* Subject */]();
        this.RegenerateData$ = this.RegenerateData.asObservable();
    }
    ZgradaService.prototype.announceChange = function () {
        this.RegenerateData.next();
    };
    ZgradaService.prototype.getZgrade = function () {
        return this.http.get(this.zgradeUrl)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    ZgradaService.prototype.getZgrada = function (id) {
        var url = this.zgradeUrl + "/" + id;
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    ZgradaService.prototype.addZgrada = function (zgrada) {
        return this.http
            .post(this.zgradeUrl, JSON.stringify(zgrada), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    ZgradaService.prototype.editZgrada = function (zgrada) {
        return this.http
            .put(this.zgradeUrl, JSON.stringify(zgrada), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    ZgradaService.prototype.deleteZgrada = function (zgradaId) {
        var url = this.zgradeUrl + "/" + zgradaId;
        return this.http
            .delete(url)
            .toPromise()
            .catch(this.handleError);
    };
    ZgradaService.prototype.handleError = function (error) {
        console.error("Error... ", error);
        return Promise.reject(error.message || error);
    };
    ZgradaService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]])
    ], ZgradaService);
    return ZgradaService;
}());



/***/ }),

/***/ "../../../../../src/app/zgrade/zgrade.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/zgrade/zgrade.component.html":
/***/ (function(module, exports) {

module.exports = "<div>\r\n    <h3>Zgrade</h3>\r\n  </div>\r\n  <table class=\"table table-bordered\">\r\n    <tr>\r\n      <th>Ime</th>\r\n      <th></th>\r\n    </tr>\r\n    <tr *ngFor=\"let zgrada of zgrade\">\r\n      <td>\r\n        {{zgrada.ime}}\r\n      </td>\r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Edit\" (click)=\"gotoEdit(zgrada)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteZgrada(zgrada.id)\">\r\n          <span class=\"fa fa-remove\" aria-hidden=\"true\"></span>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\"></span>\r\n    </button>\r\n  </div> \r\n  "

/***/ }),

/***/ "../../../../../src/app/zgrade/zgrade.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ZgradeComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__zgrada_service__ = __webpack_require__("../../../../../src/app/zgrade/zgrada.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var ZgradeComponent = /** @class */ (function () {
    function ZgradeComponent(zgradaService, router) {
        var _this = this;
        this.zgradaService = zgradaService;
        this.router = router;
        this.subscription = zgradaService.RegenerateData$.subscribe(function () {
            return _this.getZgrade();
        });
    }
    ZgradeComponent.prototype.ngOnInit = function () {
        this.getZgrade();
    };
    ZgradeComponent.prototype.getZgrade = function () {
        var _this = this;
        this.zgradaService.getZgrade().then(function (zgrade) {
            return _this.zgrade = zgrade;
        });
    };
    ZgradeComponent.prototype.gotoAdd = function () {
        this.router.navigate(['/addZgrada']);
    };
    ZgradeComponent.prototype.gotoEdit = function (zgrada) {
        this.router.navigate(['/editZgrada', zgrada.id]);
    };
    ZgradeComponent.prototype.deleteZgrada = function (zgradaId) {
        var _this = this;
        this.zgradaService.deleteZgrada(zgradaId).then(function () { return _this.getZgrade(); });
    };
    ZgradeComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'zgrade-list',
            template: __webpack_require__("../../../../../src/app/zgrade/zgrade.component.html"),
            styles: [__webpack_require__("../../../../../src/app/zgrade/zgrade.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__zgrada_service__["a" /* ZgradaService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* Router */]])
    ], ZgradeComponent);
    return ZgradeComponent;
}());



/***/ }),

/***/ "../../../../../src/environments/environment.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
var environment = {
    production: false
};


/***/ }),

/***/ "../../../../../src/main.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__("../../../platform-browser-dynamic/esm5/platform-browser-dynamic.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__("../../../../../src/app/app.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("../../../../../src/environments/environment.ts");




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* enableProdMode */])();
}
Object(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("../../../../../src/main.ts");


/***/ })

},[0]);
//# sourceMappingURL=main.bundle.js.map