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
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__firma_detail_firma_detail_component__ = __webpack_require__("../../../../../src/app/firma-detail/firma-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__zgrada_detail_zgrada_detail_component__ = __webpack_require__("../../../../../src/app/zgrada-detail/zgrada-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__stan_detail_stan_detail_component__ = __webpack_require__("../../../../../src/app/stan-detail/stan-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__korisnik_detail_korisnik_detail_component__ = __webpack_require__("../../../../../src/app/korisnik-detail/korisnik-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__komentar_detail_komentar_detail_component__ = __webpack_require__("../../../../../src/app/komentar-detail/komentar-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__komentari_komentari_service__ = __webpack_require__("../../../../../src/app/komentari/komentari.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_19__ng_bootstrap_ng_bootstrap__ = __webpack_require__("../../../../@ng-bootstrap/ng-bootstrap/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_20__kvarovi_kvarovi_component__ = __webpack_require__("../../../../../src/app/kvarovi/kvarovi.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_21__kvar_detail_kvar_detail_component__ = __webpack_require__("../../../../../src/app/kvar-detail/kvar-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_22__kvarovi_kvarovi_service__ = __webpack_require__("../../../../../src/app/kvarovi/kvarovi.service.ts");
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
                __WEBPACK_IMPORTED_MODULE_11__firme_firme_component__["a" /* FirmeComponent */],
                __WEBPACK_IMPORTED_MODULE_14__zgrada_detail_zgrada_detail_component__["a" /* ZgradaDetailComponent */],
                __WEBPACK_IMPORTED_MODULE_13__firma_detail_firma_detail_component__["a" /* FirmaDetailComponent */],
                __WEBPACK_IMPORTED_MODULE_15__stan_detail_stan_detail_component__["a" /* StanDetailComponent */],
                __WEBPACK_IMPORTED_MODULE_16__korisnik_detail_korisnik_detail_component__["a" /* KorisnikDetailComponent */],
                __WEBPACK_IMPORTED_MODULE_20__kvarovi_kvarovi_component__["a" /* KvaroviComponent */],
                __WEBPACK_IMPORTED_MODULE_21__kvar_detail_kvar_detail_component__["a" /* KvarDetailComponent */],
                __WEBPACK_IMPORTED_MODULE_17__komentar_detail_komentar_detail_component__["a" /* KomentarDetailComponent */]
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_19__ng_bootstrap_ng_bootstrap__["a" /* NgbModule */].forRoot(),
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_3__angular_http__["c" /* HttpModule */],
                __WEBPACK_IMPORTED_MODULE_4__app_routing__["a" /* routing */]
            ],
            providers: [__WEBPACK_IMPORTED_MODULE_8__zgrade_zgrada_service__["a" /* ZgradaService */], __WEBPACK_IMPORTED_MODULE_10__stanovi_stan_service__["a" /* StanService */], __WEBPACK_IMPORTED_MODULE_12__firme_firma_service__["a" /* FirmaService */], __WEBPACK_IMPORTED_MODULE_22__kvarovi_kvarovi_service__["a" /* KvarService */], __WEBPACK_IMPORTED_MODULE_18__komentari_komentari_service__["a" /* KomentarService */]],
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
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__zgrada_detail_zgrada_detail_component__ = __webpack_require__("../../../../../src/app/zgrada-detail/zgrada-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__firma_detail_firma_detail_component__ = __webpack_require__("../../../../../src/app/firma-detail/firma-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__stan_detail_stan_detail_component__ = __webpack_require__("../../../../../src/app/stan-detail/stan-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__korisnik_detail_korisnik_detail_component__ = __webpack_require__("../../../../../src/app/korisnik-detail/korisnik-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__kvar_detail_kvar_detail_component__ = __webpack_require__("../../../../../src/app/kvar-detail/kvar-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__komentar_detail_komentar_detail_component__ = __webpack_require__("../../../../../src/app/komentar-detail/komentar-detail.component.ts");










var routes = [
    { path: 'zgrade', component: __WEBPACK_IMPORTED_MODULE_1__zgrade_zgrade_component__["a" /* ZgradeComponent */] },
    { path: 'stanovi', component: __WEBPACK_IMPORTED_MODULE_2__stanovi_stanovi_component__["a" /* StanoviComponent */] },
    { path: 'firme', component: __WEBPACK_IMPORTED_MODULE_3__firme_firme_component__["a" /* FirmeComponent */] },
    { path: 'addZgrada', component: __WEBPACK_IMPORTED_MODULE_4__zgrada_detail_zgrada_detail_component__["a" /* ZgradaDetailComponent */] },
    { path: 'editZgrada/:id', component: __WEBPACK_IMPORTED_MODULE_4__zgrada_detail_zgrada_detail_component__["a" /* ZgradaDetailComponent */] },
    { path: 'firme', component: __WEBPACK_IMPORTED_MODULE_3__firme_firme_component__["a" /* FirmeComponent */] },
    { path: 'editFirma/:id', component: __WEBPACK_IMPORTED_MODULE_5__firma_detail_firma_detail_component__["a" /* FirmaDetailComponent */] },
    { path: 'addStan', component: __WEBPACK_IMPORTED_MODULE_6__stan_detail_stan_detail_component__["a" /* StanDetailComponent */] },
    { path: 'editStan/:id', component: __WEBPACK_IMPORTED_MODULE_6__stan_detail_stan_detail_component__["a" /* StanDetailComponent */] },
    { path: 'addKorisnik', component: __WEBPACK_IMPORTED_MODULE_7__korisnik_detail_korisnik_detail_component__["a" /* KorisnikDetailComponent */] },
    { path: 'editKorisnik/:id', component: __WEBPACK_IMPORTED_MODULE_7__korisnik_detail_korisnik_detail_component__["a" /* KorisnikDetailComponent */] },
    { path: 'addKvar', component: __WEBPACK_IMPORTED_MODULE_4__zgrada_detail_zgrada_detail_component__["a" /* ZgradaDetailComponent */] },
    { path: 'editKvar/:id', component: __WEBPACK_IMPORTED_MODULE_8__kvar_detail_kvar_detail_component__["a" /* KvarDetailComponent */] },
    { path: 'addKomentar', component: __WEBPACK_IMPORTED_MODULE_9__komentar_detail_komentar_detail_component__["a" /* KomentarDetailComponent */] },
    { path: 'editKomentar/:id', component: __WEBPACK_IMPORTED_MODULE_9__komentar_detail_komentar_detail_component__["a" /* KomentarDetailComponent */] },
    { path: '**', redirectTo: '' }
];
var routing = __WEBPACK_IMPORTED_MODULE_0__angular_router__["c" /* RouterModule */].forRoot(routes);


/***/ }),

/***/ "../../../../../src/app/firma-detail/firma-detail.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/firma-detail/firma-detail.component.html":
/***/ (function(module, exports) {

module.exports = "<div>\r\n    <h3>Firma</h3>\r\n  </div>\r\n  \r\n  <div>\r\n  \r\n    <form >\r\n          <div class=\"form-group\">\r\n            <label for=\"field1c\" class=\"form-control-label\">Ime</label>\r\n            <input type=\"text\" [(ngModel)]=\"firma.ime\" placeholder=\"Ime\" \r\n               class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n          </div>\r\n  \r\n          <div class=\"form-group\">\r\n            <label for=\"field2c\" class=\"form-control-label\">Adresa</label>\r\n            <input type=\"text\" [(ngModel)]=\"firma.adresa\" placeholder=\"Adresa\" \r\n               class=\"form-control\" id=\"field2c\" name=\"field2\">\r\n          </div>\r\n         \r\n          <div class=\"form-group\">\r\n            <label for=\"field3c\" class=\"form-control-label\">Telefon</label>\r\n            <input type=\"text\" [(ngModel)]=\"firma.telefon\" placeholder=\"Telefon\" \r\n               class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n          </div>\r\n\r\n          <div class=\"form-group\">\r\n            <label for=\"field4c\" class=\"form-control-label\">Email</label>\r\n            <input type=\"text\" [(ngModel)]=\"firma.email\" placeholder=\"Email\" \r\n               class=\"form-control\" id=\"field4c\" name=\"field4\">\r\n          </div>\r\n\r\n          <div class=\"form-group\">\r\n            <label for=\"field5c\" class=\"form-control-label\">Web site</label>\r\n            <input type=\"text\" [(ngModel)]=\"firma.webSite\" placeholder=\"WebSite\" \r\n               class=\"form-control\" id=\"field5c\" name=\"field5\">\r\n          </div>\r\n\r\n          \r\n     </form>\r\n    \r\n  \r\n  </div>\r\n  <div>\r\n    <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n    <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n  </div> "

/***/ }),

/***/ "../../../../../src/app/firma-detail/firma-detail.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return FirmaDetailComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common__ = __webpack_require__("../../../common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__firme_firma_service__ = __webpack_require__("../../../../../src/app/firme/firma.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__model_firma_model__ = __webpack_require__("../../../../../src/app/model/firma.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_switchMap__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/switchMap.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var FirmaDetailComponent = /** @class */ (function () {
    function FirmaDetailComponent(firmaService, route, location, router) {
        this.firmaService = firmaService;
        this.route = route;
        this.location = location;
        this.router = router;
        this.firma = new __WEBPACK_IMPORTED_MODULE_4__model_firma_model__["a" /* Firma */]({
            adresa: '',
            ime: '',
            telefon: 13567,
            email: '',
            webSite: ''
        });
        this.mode = 'ADD';
    }
    FirmaDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        if (this.route.snapshot.params['id']) {
            this.mode = 'EDIT';
            // fetch course if we edit the existing course
            this.route.params
                .switchMap(function (params) {
                return _this.firmaService.getFirma(+params['id']);
            })
                .subscribe(function (firma) {
                _this.firma = firma;
            });
        }
    };
    FirmaDetailComponent.prototype.save = function () {
        this.mode == 'ADD' ? this.add() : this.edit();
    };
    FirmaDetailComponent.prototype.add = function () {
        var _this = this;
        this.firmaService.addFirma(this.firma)
            .then(function (firma) {
            _this.firmaService.announceChange();
            _this.goBack();
        });
    };
    FirmaDetailComponent.prototype.edit = function () {
        var _this = this;
        this.firmaService.editFirma(this.firma)
            .then(function (firma) {
            _this.firmaService.announceChange();
            _this.goBack();
        });
    };
    FirmaDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    FirmaDetailComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-firma-detail',
            template: __webpack_require__("../../../../../src/app/firma-detail/firma-detail.component.html"),
            styles: [__webpack_require__("../../../../../src/app/firma-detail/firma-detail.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__firme_firma_service__["a" /* FirmaService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], FirmaDetailComponent);
    return FirmaDetailComponent;
}());



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
        var url = 'api/firma/all';
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    FirmaService.prototype.getFirma = function (id) {
        var url = "api/firma/all/id";
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
    FirmaService.prototype.editFirma = function (firma) {
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

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Firme</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Ime</th>\r\n      <th>Adresa</th>\r\n      <th>Telefon</th>\r\n      <th>Email</th>\r\n      <th>Web site</th>\r\n    </tr>\r\n    <tr *ngFor=\"let firma of firme\">\r\n      <td>\r\n        {{firma.ime}}\r\n      </td>\r\n      <td>\r\n        {{firma.adresa}}\r\n      </td>\r\n      <td>\r\n        {{firma.telefon}}\r\n      </td>\r\n      <td>\r\n        {{firma.email}}\r\n      </td>\r\n      <td>\r\n        {{firma.webSite}}\r\n      </td>\r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(firma)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteFirma(firma.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div> \r\n  "

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
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__firma_service__["a" /* FirmaService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], FirmeComponent);
    return FirmeComponent;
}());



/***/ }),

/***/ "../../../../../src/app/komentar-detail/komentar-detail.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/komentar-detail/komentar-detail.component.html":
/***/ (function(module, exports) {

module.exports = "<div>\r\n  <h3>Komentar</h3>\r\n</div>\r\n\r\n<div>\r\n  <form>\r\n    <div class=\"form-group\">\r\n      <label for=\"field1c\" class=\"form-control-label\">Text</label>\r\n        <input type=\"text\" [(ngModel)]=\"komentar.text\" placeholder=\"Text\" \r\n        class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n</div>\r\n\r\n<div>\r\n  <form>\r\n    <div class=\"form-group\">\r\n      <label for=\"field2c\" class=\"form-control-label\">Datum kreiranja</label>\r\n        <input type=\"text\" [(ngModel)]=\"komentar.datKreiranja\" placeholder=\"DatKreiranja\" \r\n        class=\"form-control\" id=\"field2c\" name=\"field2\">\r\n</div>\r\n\r\n<div>\r\n  <form>\r\n    <div class=\"form-group\">\r\n      <label for=\"field3c\" class=\"form-control-label\">Kreator</label>\r\n        <input type=\"text\" [(ngModel)]=\"komentar.kreator.ime\" placeholder=\"Kreator\" \r\n        class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n</div>\r\n\r\n<!--<div>\r\n  <form>\r\n    <div class=\"form-group\">\r\n      <label for=\"field4c\" class=\"form-control-label\">Kvar</label>\r\n        <input type=\"text\" [(ngModel)]=\"komentar.kvar.ime\" placeholder=\"Kvar\" \r\n        class=\"form-control\" id=\"field4c\" name=\"field4\">\r\n</div> -->\r\n\r\n\r\n\r\n</form>\r\n \r\n\r\n<div>\r\n  <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n  <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n</div>"

/***/ }),

/***/ "../../../../../src/app/komentar-detail/komentar-detail.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return KomentarDetailComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common__ = __webpack_require__("../../../common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__komentari_komentari_service__ = __webpack_require__("../../../../../src/app/komentari/komentari.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__model_komentar_model__ = __webpack_require__("../../../../../src/app/model/komentar.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__model_korisnik_model__ = __webpack_require__("../../../../../src/app/model/korisnik.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__model_kvar_model__ = __webpack_require__("../../../../../src/app/model/kvar.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__model_zgrada_model__ = __webpack_require__("../../../../../src/app/model/zgrada.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8_rxjs_add_operator_switchMap__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/switchMap.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__kvarovi_kvarovi_service__ = __webpack_require__("../../../../../src/app/kvarovi/kvarovi.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__korisnici_korisnik_service__ = __webpack_require__("../../../../../src/app/korisnici/korisnik.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};











var KomentarDetailComponent = /** @class */ (function () {
    function KomentarDetailComponent(komentarService, kvarService, korisnikService, route, location, router) {
        this.komentarService = komentarService;
        this.kvarService = kvarService;
        this.korisnikService = korisnikService;
        this.route = route;
        this.location = location;
        this.router = router;
        this.komentar = new __WEBPACK_IMPORTED_MODULE_4__model_komentar_model__["a" /* Komentar */]({
            datKreiranja: null,
            text: '',
            kreator: new __WEBPACK_IMPORTED_MODULE_5__model_korisnik_model__["a" /* Korisnik */]({
                ime: '',
                lozinka: '',
                korisIme: '',
                uloga: '',
            }),
            kvar: new __WEBPACK_IMPORTED_MODULE_6__model_kvar_model__["a" /* Kvar */]({
                datKreiranja: null,
                datZakazivanja: null,
                datPopravke: null,
                ime: '',
                opis: '',
                popravljen: false,
                kreator: new __WEBPACK_IMPORTED_MODULE_5__model_korisnik_model__["a" /* Korisnik */]({
                    ime: '',
                    lozinka: '',
                    korisIme: '',
                    uloga: '',
                }),
                zgrada: new __WEBPACK_IMPORTED_MODULE_7__model_zgrada_model__["a" /* Zgrada */]({
                    ime: '',
                    adresa: '',
                    brStanova: null,
                    brNaseljenih: null,
                    vlasnik: new __WEBPACK_IMPORTED_MODULE_5__model_korisnik_model__["a" /* Korisnik */]({
                        ime: '',
                        lozinka: '',
                        korisIme: '',
                        uloga: '',
                    })
                }),
                radnik: new __WEBPACK_IMPORTED_MODULE_5__model_korisnik_model__["a" /* Korisnik */]({
                    ime: '',
                    lozinka: '',
                    korisIme: '',
                    uloga: '',
                })
            })
        });
        this.mode = 'ADD';
        /*komentarService.RegenerateData$.subscribe(() =>
          this.getEnrollments()
        );*/
    }
    KomentarDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        if (this.route.snapshot.params['id']) {
            this.mode = 'EDIT';
            // fetch course if we edit the existing course
            this.route.params
                .switchMap(function (params) {
                return _this.komentarService.getKomentar(+params['id']);
            })
                .subscribe(function (komentar) {
                _this.komentar = komentar;
                //this.getKomentari();
            });
        }
    };
    KomentarDetailComponent.prototype.save = function () {
        this.mode == 'ADD' ? this.add() : this.edit();
    };
    KomentarDetailComponent.prototype.add = function () {
        var _this = this;
        this.komentarService.addKomentar(this.komentar)
            .then(function (komentar) {
            _this.komentarService.announceChange();
            _this.goBack();
        });
    };
    KomentarDetailComponent.prototype.edit = function () {
        var _this = this;
        this.komentarService.editKomentar(this.komentar)
            .then(function (komentar) {
            _this.komentarService.announceChange();
            _this.goBack();
        });
    };
    KomentarDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    KomentarDetailComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-komentar-detail',
            template: __webpack_require__("../../../../../src/app/komentar-detail/komentar-detail.component.html"),
            styles: [__webpack_require__("../../../../../src/app/komentar-detail/komentar-detail.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__komentari_komentari_service__["a" /* KomentarService */], __WEBPACK_IMPORTED_MODULE_9__kvarovi_kvarovi_service__["a" /* KvarService */],
            __WEBPACK_IMPORTED_MODULE_10__korisnici_korisnik_service__["a" /* KorisnikService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], KomentarDetailComponent);
    return KomentarDetailComponent;
}());



/***/ }),

/***/ "../../../../../src/app/komentari/komentari.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return KomentarService; });
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




var KomentarService = /** @class */ (function () {
    function KomentarService(http) {
        this.http = http;
        this.komentariUrl = 'api/komentar';
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        this.RegenerateData = new __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__["a" /* Subject */]();
        this.RegenerateData$ = this.RegenerateData.asObservable();
    }
    KomentarService.prototype.announceChange = function () {
        this.RegenerateData.next();
    };
    KomentarService.prototype.getKomentari = function () {
        return this.http.get(this.komentariUrl)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    KomentarService.prototype.getKomentar = function (id) {
        var url = this.komentariUrl + "/" + id;
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    KomentarService.prototype.addKomentar = function (komentar) {
        return this.http
            .post(this.komentariUrl, JSON.stringify(komentar), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    KomentarService.prototype.editKomentar = function (komentar) {
        return this.http
            .put(this.komentariUrl, JSON.stringify(komentar), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    KomentarService.prototype.deleteKomentar = function (komentarId) {
        var url = this.komentariUrl + "/" + komentarId;
        return this.http
            .delete(url)
            .toPromise()
            .catch(this.handleError);
    };
    KomentarService.prototype.handleError = function (error) {
        console.error("Error... ", error);
        return Promise.reject(error.message || error);
    };
    KomentarService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]])
    ], KomentarService);
    return KomentarService;
}());



/***/ }),

/***/ "../../../../../src/app/korisnici/korisnik.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return KorisnikService; });
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



//import { Enrollment } from '../model/enrollment.model';

var KorisnikService = /** @class */ (function () {
    function KorisnikService(http) {
        this.http = http;
        this.korisniciUrl = 'api/korisnici';
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        this.RegenerateData = new __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__["a" /* Subject */]();
        this.RegenerateData$ = this.RegenerateData.asObservable();
    }
    KorisnikService.prototype.announceChange = function () {
        this.RegenerateData.next();
    };
    KorisnikService.prototype.getKorisnici = function () {
        return this.http.get(this.korisniciUrl)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    KorisnikService.prototype.getKorisnik = function (id) {
        var url = this.korisniciUrl + "/" + id;
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    KorisnikService.prototype.addKorisnik = function (korisnik) {
        return this.http
            .post(this.korisniciUrl, JSON.stringify(korisnik), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    KorisnikService.prototype.editKorisnik = function (korisnik) {
        return this.http
            .put(this.korisniciUrl, JSON.stringify(korisnik), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    KorisnikService.prototype.deleteKorisnik = function (korisnikId) {
        var url = this.korisniciUrl + "/" + korisnikId;
        return this.http
            .delete(url)
            .toPromise()
            .catch(this.handleError);
    };
    /* //getStudentEnrollments(studentId: number): Promise<Enrollment[]> {
         const url = `${this.studentsUrl}/${studentId}/courses`;
         return this.http.get(url)
             .toPromise()
             .then(response =>
                 response.json() as Enrollment[])
             .catch(this.handleError);
 }*/
    KorisnikService.prototype.handleError = function (error) {
        console.error("Error... ", error);
        return Promise.reject(error.message || error);
    };
    KorisnikService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]])
    ], KorisnikService);
    return KorisnikService;
}());



/***/ }),

/***/ "../../../../../src/app/korisnik-detail/korisnik-detail.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/korisnik-detail/korisnik-detail.component.html":
/***/ (function(module, exports) {

module.exports = "<div>\r\n    <h3>Korisnik</h3>\r\n  </div>\r\n  \r\n  <div>\r\n  \r\n    <form >\r\n          <div class=\"form-group\">\r\n            <label for=\"field1c\" class=\"form-control-label\">Ime</label>\r\n            <input type=\"text\" [(ngModel)]=\"korisnik.ime\" placeholder=\"Ime\" \r\n               class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n          </div>\r\n  \r\n          <div class=\"form-group\">\r\n            <label for=\"field2c\" class=\"form-control-label\">Korisnicko ime</label>\r\n            <input type=\"text\" [(ngModel)]=\"korisnik.korisIme\" placeholder=\"Koris Ime\" \r\n               class=\"form-control\" id=\"field2c\" name=\"field2\">\r\n          </div>\r\n         \r\n          <div class=\"form-group\">\r\n            <label for=\"field3c\" class=\"form-control-label\">Lozinka</label>\r\n            <input type=\"text\" [(ngModel)]=\"korisnik.lozinka\" placeholder=\"Lozinka\" \r\n               class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n          </div>\r\n          <div class=\"form-group\">\r\n            <label for=\"field3c\" class=\"form-control-label\">Uloga</label>\r\n            <input type=\"text\" [(ngModel)]=\"korisnik.uloga\" placeholder=\"Uloga\" \r\n               class=\"form-control\" id=\"field4c\" name=\"field4\">\r\n          </div>\r\n\r\n     </form>\r\n    \r\n  \r\n  </div>\r\n  <div>\r\n    <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n    <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n  </div> "

/***/ }),

/***/ "../../../../../src/app/korisnik-detail/korisnik-detail.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return KorisnikDetailComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common__ = __webpack_require__("../../../common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__korisnici_korisnik_service__ = __webpack_require__("../../../../../src/app/korisnici/korisnik.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__model_korisnik_model__ = __webpack_require__("../../../../../src/app/model/korisnik.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_switchMap__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/switchMap.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var KorisnikDetailComponent = /** @class */ (function () {
    function KorisnikDetailComponent(korisnikService, route, location) {
        this.korisnikService = korisnikService;
        this.route = route;
        this.location = location;
        this.korisnik = new __WEBPACK_IMPORTED_MODULE_4__model_korisnik_model__["a" /* Korisnik */]({
            ime: '',
            korisIme: '',
            lozinka: '',
            uloga: ''
        });
        this.mode = 'ADD';
    }
    KorisnikDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        if (this.route.snapshot.params['id']) {
            this.mode = 'EDIT';
            // fetch student if we edit the existing student
            this.route.params
                .switchMap(function (params) {
                return _this.korisnikService.getKorisnik(+params['id']);
            }) // convert to number
                .subscribe(function (korisnik) {
                _this.korisnik = korisnik;
            });
        }
    };
    KorisnikDetailComponent.prototype.save = function () {
        this.mode == 'ADD' ? this.add() : this.edit();
    };
    KorisnikDetailComponent.prototype.add = function () {
        var _this = this;
        this.korisnikService.addKorisnik(this.korisnik)
            .then(function (korisnik) {
            _this.korisnikService.announceChange();
            _this.goBack();
        });
    };
    KorisnikDetailComponent.prototype.edit = function () {
        var _this = this;
        this.korisnikService.editKorisnik(this.korisnik)
            .then(function (korisnik) {
            _this.korisnikService.announceChange();
            _this.goBack();
        });
    };
    KorisnikDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    KorisnikDetailComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-korisnik-detail',
            template: __webpack_require__("../../../../../src/app/korisnik-detail/korisnik-detail.component.html"),
            styles: [__webpack_require__("../../../../../src/app/korisnik-detail/korisnik-detail.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__korisnici_korisnik_service__["a" /* KorisnikService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */]])
    ], KorisnikDetailComponent);
    return KorisnikDetailComponent;
}());



/***/ }),

/***/ "../../../../../src/app/kvar-detail/kvar-detail.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/kvar-detail/kvar-detail.component.html":
/***/ (function(module, exports) {

module.exports = "<div>\r\n  <h3>Kvar</h3>\r\n</div>\r\n\r\n<div>\r\n  <form>\r\n    <div class=\"form-group\">\r\n      <label for=\"field1c\" class=\"form-control-label\">Ime</label>\r\n        <input type=\"text\" [(ngModel)]=\"kvar.ime\" placeholder=\"Name\" \r\n        class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n</div>\r\n\r\n</form>\r\n  <!--<div *ngIf=\"kurs.id\">\r\n    <div>\r\n      <h3>Komentari</h3>\r\n      <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAddKomentar()\">\r\n        <span class=\"fa fa-plus\" aria-hidden=\"true\"></span>\r\n      </button>\r\n    </div>\r\n    <table class=\"table table-bordered\">\r\n      <tr *ngFor=\"let komentar of komentari\">\r\n        <td>\r\n        {{komentar.id}} {{komentar.ime}} {{komentar.opis}} {{komentar.kreator.ime}} {{komentar.datKreiranja}}\r\n        </td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary right\" aria-label=\"Delete\" (click)=\"deleteKomentar(komentar.id)\">\r\n            <span class=\"fa fa-remove\" aria-hidden=\"true\"></span>\r\n          </button>\r\n        </td>\r\n      </tr>\r\n    </table>   \r\n  </div>\r\n</div>-->\r\n<div>\r\n  <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n  <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n</div>"

/***/ }),

/***/ "../../../../../src/app/kvar-detail/kvar-detail.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return KvarDetailComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common__ = __webpack_require__("../../../common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__kvarovi_kvarovi_service__ = __webpack_require__("../../../../../src/app/kvarovi/kvarovi.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__model_kvar_model__ = __webpack_require__("../../../../../src/app/model/kvar.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__model_korisnik_model__ = __webpack_require__("../../../../../src/app/model/korisnik.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__model_zgrada_model__ = __webpack_require__("../../../../../src/app/model/zgrada.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7_rxjs_add_operator_switchMap__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/switchMap.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__zgrade_zgrada_service__ = __webpack_require__("../../../../../src/app/zgrade/zgrada.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__korisnici_korisnik_service__ = __webpack_require__("../../../../../src/app/korisnici/korisnik.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};










var KvarDetailComponent = /** @class */ (function () {
    function KvarDetailComponent(kvarService, zgradaService, korisnikService, route, location, router) {
        this.kvarService = kvarService;
        this.zgradaService = zgradaService;
        this.korisnikService = korisnikService;
        this.route = route;
        this.location = location;
        this.router = router;
        /*komentarService.RegenerateData$.subscribe(() =>
          this.getEnrollments()
        );*/
        this.kvar = new __WEBPACK_IMPORTED_MODULE_4__model_kvar_model__["a" /* Kvar */]({
            datKreiranja: null,
            datZakazivanja: null,
            datPopravke: null,
            ime: '',
            opis: '',
            popravljen: false,
            kreator: new __WEBPACK_IMPORTED_MODULE_5__model_korisnik_model__["a" /* Korisnik */]({
                ime: '',
                lozinka: '',
                korisIme: '',
                uloga: '',
            }),
            zgrada: new __WEBPACK_IMPORTED_MODULE_6__model_zgrada_model__["a" /* Zgrada */]({
                ime: '',
                adresa: '',
                brStanova: null,
                brNaseljenih: null,
                vlasnik: new __WEBPACK_IMPORTED_MODULE_5__model_korisnik_model__["a" /* Korisnik */]({
                    ime: '',
                    lozinka: '',
                    korisIme: '',
                    uloga: '',
                })
            }),
            radnik: new __WEBPACK_IMPORTED_MODULE_5__model_korisnik_model__["a" /* Korisnik */]({
                ime: '',
                lozinka: '',
                korisIme: '',
                uloga: '',
            })
        });
        this.mode = 'ADD';
    }
    KvarDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        if (this.route.snapshot.params['id']) {
            this.mode = 'EDIT';
            // fetch course if we edit the existing course
            this.route.params
                .switchMap(function (params) {
                return _this.kvarService.getKvar(+params['id']);
            })
                .subscribe(function (kvar) {
                _this.kvar = kvar;
                //this.getKomentari();
            });
        }
    };
    /*private getKomentari(): void {
      this.kvarService.getKvarKomentari(this.kvar.id).then(komentari =>
        this.komentari = komentari);
    }*/
    KvarDetailComponent.prototype.save = function () {
        this.mode == 'ADD' ? this.add() : this.edit();
    };
    KvarDetailComponent.prototype.add = function () {
        var _this = this;
        this.kvarService.addKvar(this.kvar)
            .then(function (kvar) {
            _this.kvarService.announceChange();
            _this.goBack();
        });
    };
    KvarDetailComponent.prototype.edit = function () {
        var _this = this;
        this.kvarService.editKvar(this.kvar)
            .then(function (kvar) {
            _this.kvarService.announceChange();
            _this.goBack();
        });
    };
    KvarDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    KvarDetailComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-kvar-detail',
            template: __webpack_require__("../../../../../src/app/kvar-detail/kvar-detail.component.html"),
            styles: [__webpack_require__("../../../../../src/app/kvar-detail/kvar-detail.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__kvarovi_kvarovi_service__["a" /* KvarService */], __WEBPACK_IMPORTED_MODULE_8__zgrade_zgrada_service__["a" /* ZgradaService */],
            __WEBPACK_IMPORTED_MODULE_9__korisnici_korisnik_service__["a" /* KorisnikService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], KvarDetailComponent);
    return KvarDetailComponent;
}());



/***/ }),

/***/ "../../../../../src/app/kvarovi/kvarovi.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/kvarovi/kvarovi.component.html":
/***/ (function(module, exports) {

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Kvarovi</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Ime</th>\r\n      <th>Opis</th>\r\n      <th>Datum kreiranja</th>\r\n      <th>Datum zakazivanja</th>\r\n      <th>Datum popravke</th>\r\n      <th>Kreator</th>\r\n      <th>Radnik</th>\r\n    </tr>\r\n    <tr *ngFor=\"let kvar of kvar\">\r\n      <td>{{kvar.id}}</td>\r\n      <td>{{kvar.ime}}</td>\r\n      <td>{{kvar.opis}}</td>\r\n      <td>{{kvar.datKreiranja}}</td>\r\n      <td>{{kvar.datZakazivanja}}</td>\r\n      <td>{{kvar.datPopravke}}</td>\r\n      <td>{{kvar.kreator.ime}}</td>\r\n      <td>{{kvar.radnik.ime}}</td>\r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(kvar)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteKvar(kvar.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div>"

/***/ }),

/***/ "../../../../../src/app/kvarovi/kvarovi.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return KvaroviComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__kvarovi_service__ = __webpack_require__("../../../../../src/app/kvarovi/kvarovi.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var KvaroviComponent = /** @class */ (function () {
    function KvaroviComponent(kvarService, router) {
        var _this = this;
        this.kvarService = kvarService;
        this.router = router;
        this.subscription = kvarService.RegenerateData$.subscribe(function () {
            return _this.getKvarovi();
        });
    }
    KvaroviComponent.prototype.ngOnInit = function () {
        this.getKvarovi();
    };
    KvaroviComponent.prototype.getKvarovi = function () {
        var _this = this;
        this.kvarService.getKvarovi().then(function (kvarovi) {
            return _this.kvar = kvarovi;
        });
    };
    /*getKvar(id: number): void {
      this.kvarService.getKvar(id).then(
        this.router.navigate(['/addKomentar']);
      )
    }*/
    KvaroviComponent.prototype.gotoAdd = function () {
        this.router.navigate(['/addKvar']);
    };
    KvaroviComponent.prototype.gotoEdit = function (kvar) {
        this.router.navigate(['/editKvar', kvar.id]);
    };
    KvaroviComponent.prototype.deleteKvar = function (kvaroviId) {
        var _this = this;
        this.kvarService.deleteKvar(kvaroviId).then(function () { return _this.getKvarovi(); });
    };
    KvaroviComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'kvarovi-list',
            template: __webpack_require__("../../../../../src/app/kvarovi/kvarovi.component.html"),
            styles: [__webpack_require__("../../../../../src/app/kvarovi/kvarovi.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__kvarovi_service__["a" /* KvarService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], KvaroviComponent);
    return KvaroviComponent;
}());



/***/ }),

/***/ "../../../../../src/app/kvarovi/kvarovi.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return KvarService; });
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




var KvarService = /** @class */ (function () {
    function KvarService(http) {
        this.http = http;
        this.kvaroviUrl = 'api/kvar';
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        this.RegenerateData = new __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__["a" /* Subject */]();
        this.RegenerateData$ = this.RegenerateData.asObservable();
    }
    KvarService.prototype.announceChange = function () {
        this.RegenerateData.next();
    };
    KvarService.prototype.getKvarovi = function () {
        return this.http.get("api/kvar/all")
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    KvarService.prototype.getKvar = function (id) {
        var url = this.kvaroviUrl + "/all/" + id;
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    KvarService.prototype.addKvar = function (kvar) {
        return this.http
            .post(this.kvaroviUrl, JSON.stringify(kvar), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    KvarService.prototype.editKvar = function (kvar) {
        return this.http
            .put(this.kvaroviUrl, JSON.stringify(kvar), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    KvarService.prototype.deleteKvar = function (kvarId) {
        var url = this.kvaroviUrl + "/" + kvarId;
        return this.http
            .delete(url)
            .toPromise()
            .catch(this.handleError);
    };
    /*getKvarKomentar(kvarId: number): Promise<Komentar[]> {
        const url = `${this.kvaroviUrl}/${kvarId}/komentar/all`;
        return this.http.get(url)
            .toPromise()
            .then(response =>
                response.json() as Komentar[])
            .catch(this.handleError);
    } */
    KvarService.prototype.handleError = function (error) {
        console.error("Error... ", error);
        return Promise.reject(error.message || error);
    };
    KvarService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]])
    ], KvarService);
    return KvarService;
}());



/***/ }),

/***/ "../../../../../src/app/model/firma.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Firma; });
var Firma = /** @class */ (function () {
    function Firma(firmaCfg) {
        this.id = firmaCfg.id;
        this.ime = firmaCfg.ime;
        this.adresa = firmaCfg.adresa;
        this.telefon = firmaCfg.telefon;
        this.webSite = firmaCfg.webSite;
        this.email = firmaCfg.email;
    }
    return Firma;
}());



/***/ }),

/***/ "../../../../../src/app/model/komentar.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Komentar; });
var Komentar = /** @class */ (function () {
    function Komentar(komentarCfg) {
        this.id = komentarCfg.id;
        this.datKreiranja = komentarCfg.datKreiranja;
        this.text = komentarCfg.text;
        this.kreator = komentarCfg.kreator;
        this.kvar = komentarCfg.kvar;
    }
    return Komentar;
}());



/***/ }),

/***/ "../../../../../src/app/model/korisnik.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Korisnik; });
var Korisnik = /** @class */ (function () {
    function Korisnik(korisnikCfg) {
        this.id = korisnikCfg.id;
        this.ime = korisnikCfg.ime;
        this.korisIme = korisnikCfg.korisIme;
        this.lozinka = korisnikCfg.lozinka;
        this.uloga = korisnikCfg.uloga;
    }
    return Korisnik;
}());



/***/ }),

/***/ "../../../../../src/app/model/kvar.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Kvar; });
var Kvar = /** @class */ (function () {
    function Kvar(kvarCfg) {
        this.id = kvarCfg.id;
        this.ime = kvarCfg.ime;
        this.datKreiranja = kvarCfg.datKreiranja;
        this.datZakazivanja = kvarCfg.datZakazivanja;
        this.datPopravke = kvarCfg.datPopravke;
        this.opis = kvarCfg.opis;
        this.popravljen = kvarCfg.popravljen;
        this.kreator = kvarCfg.kreator;
        this.radnik = kvarCfg.radnik;
        this.zgrada = kvarCfg.zgrada;
    }
    return Kvar;
}());



/***/ }),

/***/ "../../../../../src/app/model/stan.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Stan; });
var Stan = /** @class */ (function () {
    function Stan(stanCfg) {
        this.id = stanCfg.id;
        this.ime = stanCfg.ime;
        this.adresa = stanCfg.adresa;
        this.brStanovnika = stanCfg.brStanovnika;
        this.vlasnik = stanCfg.vlasnik;
        this.zgrada = stanCfg.zgrada;
    }
    return Stan;
}());



/***/ }),

/***/ "../../../../../src/app/model/zgrada.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Zgrada; });
var Zgrada = /** @class */ (function () {
    function Zgrada(zgradaCfg) {
        this.id = zgradaCfg.id;
        this.ime = zgradaCfg.ime;
        this.adresa = zgradaCfg.adresa;
        this.brStanova = zgradaCfg.brStanova;
        this.brNaseljenih = zgradaCfg.brNaseljenih;
        this.vlasnik = zgradaCfg.vlasnik;
    }
    return Zgrada;
}());



/***/ }),

/***/ "../../../../../src/app/stan-detail/stan-detail.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/stan-detail/stan-detail.component.html":
/***/ (function(module, exports) {

module.exports = "<div>\r\n    <h3>Stan</h3>\r\n  </div>\r\n  <div>\r\n  \r\n    <form >\r\n      <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Id</label>\r\n        <input type=\"text\" [(ngModel)]=\"stan.id\" placeholder=\"id\" \r\n          class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n      </div>\r\n      <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Ime</label>\r\n        <input type=\"text\" [(ngModel)]=\"stan.ime\" placeholder=\"upisite ime\" \r\n          class=\"form-control\" id=\"field2c\" name=\"field2\">\r\n      </div>\r\n  \r\n      <div class=\"form-group\">\r\n        <label for=\"field2c\" class=\"form-control-label\">Adresa</label>\r\n        <input type=\"text\" [(ngModel)]=\"stan.adresa\" placeholder=\"upisite adresu\" \r\n          class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n      </div>\r\n         \r\n      <div class=\"form-group\">\r\n        <label for=\"field3c\" class=\"form-control-label\">Broj stanovnika</label>\r\n        <input type=\"text\" [(ngModel)]=\"stan.brStanovnika\" placeholder=\"stanovnici\" \r\n          class=\"form-control\" id=\"field4c\" name=\"field4\">\r\n      </div>\r\n      <div class=\"form-group\">\r\n        <label for=\"field4c\" class=\"form-control-label\">Vlasnik</label>\r\n        <input type=\"text\" [(ngModel)]=\"stan.vlasnik.korisIme\" placeholder=\"Vlasnik\" \r\n          class=\"form-control\" id=\"field5c\" name=\"field5\">\r\n      </div>\r\n      <div class=\"form-group\">\r\n        <label for=\"field5c\" class=\"form-control-label\">Zgrada</label>\r\n        <input type=\"text\" [(ngModel)]=\"stan.zgrada.id\" placeholder=\"zgrada\" \r\n          class=\"form-control\" id=\"field6c\" name=\"field6\">\r\n      </div>\r\n     </form>\r\n  <div>\r\n    <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n    <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n  </div> "

/***/ }),

/***/ "../../../../../src/app/stan-detail/stan-detail.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StanDetailComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common__ = __webpack_require__("../../../common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__stanovi_stan_service__ = __webpack_require__("../../../../../src/app/stanovi/stan.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__model_stan_model__ = __webpack_require__("../../../../../src/app/model/stan.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_switchMap__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/switchMap.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__model_zgrada_model__ = __webpack_require__("../../../../../src/app/model/zgrada.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__model_korisnik_model__ = __webpack_require__("../../../../../src/app/model/korisnik.model.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};








var StanDetailComponent = /** @class */ (function () {
    function StanDetailComponent(stanService, route, location) {
        this.stanService = stanService;
        this.route = route;
        this.location = location;
        this.stan = new __WEBPACK_IMPORTED_MODULE_4__model_stan_model__["a" /* Stan */]({
            ime: '',
            adresa: '',
            zgrada: new __WEBPACK_IMPORTED_MODULE_6__model_zgrada_model__["a" /* Zgrada */]({
                ime: '',
                adresa: '',
                brStanova: null,
                brNaseljenih: null,
                vlasnik: new __WEBPACK_IMPORTED_MODULE_7__model_korisnik_model__["a" /* Korisnik */]({
                    ime: '',
                    lozinka: '',
                    korisIme: '',
                    uloga: '',
                })
            }),
            brStanovnika: '',
            vlasnik: new __WEBPACK_IMPORTED_MODULE_7__model_korisnik_model__["a" /* Korisnik */]({
                ime: '',
                lozinka: '',
                korisIme: '',
                uloga: '',
            })
        });
        this.mode = 'ADD';
    }
    StanDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        if (this.route.snapshot.params['id']) {
            this.mode = 'EDIT';
            // fetch student if we edit the existing student
            this.route.params
                .switchMap(function (params) {
                return _this.stanService.getStan(+params['id']);
            }) // convert to number
                .subscribe(function (stan) {
                _this.stan = _this.stan;
            });
        }
    };
    StanDetailComponent.prototype.save = function () {
        this.mode == 'ADD' ? this.add() : this.edit();
    };
    StanDetailComponent.prototype.add = function () {
        var _this = this;
        this.stanService.addStan(this.stan)
            .then(function (stan) {
            _this.stanService.announceChange();
            _this.goBack();
        });
    };
    StanDetailComponent.prototype.edit = function () {
        var _this = this;
        this.stanService.editStan(this.stan)
            .then(function (stan) {
            _this.stanService.announceChange();
            _this.goBack();
        });
    };
    StanDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    StanDetailComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-stan-detail',
            template: __webpack_require__("../../../../../src/app/stan-detail/stan-detail.component.html"),
            styles: [__webpack_require__("../../../../../src/app/stan-detail/stan-detail.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__stanovi_stan_service__["a" /* StanService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */]])
    ], StanDetailComponent);
    return StanDetailComponent;
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
        var url = 'api/stan/all';
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    StanService.prototype.getStan = function (id) {
        var url = this.stanoviUrl + "/all/" + id;
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
        var url = this.stanoviUrl + "/all/" + stan.id;
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

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Stanovi</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Ime</th>\r\n      <th>Adresa</th>\r\n      <th>Broj stanovnika</th>\r\n      <th>Vlasnik</th>\r\n      <th>Zgrada</th>\r\n    </tr>\r\n    <tr *ngFor=\"let stan of stanovi\">\r\n      <td>\r\n        {{stan.id}}\r\n      </td>\r\n      <td>\r\n        {{stan.ime}}\r\n      </td>\r\n      <td>\r\n        {{stan.adresa}}\r\n      </td>\r\n      <td>\r\n        {{stan.brStanovnika}}\r\n      </td>\r\n      <td>\r\n        {{stan.vlasnik.korisIme}}\r\n      </td>\r\n      <td>\r\n        {{stan.zgrada.ime}}\r\n      </td>\r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(stan)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteStan(stan.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div> \r\n  "

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
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__stan_service__["a" /* StanService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], StanoviComponent);
    return StanoviComponent;
}());



/***/ }),

/***/ "../../../../../src/app/zgrada-detail/zgrada-detail.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/zgrada-detail/zgrada-detail.component.html":
/***/ (function(module, exports) {

module.exports = "<div>\r\n    <h3>Zgrada</h3>\r\n  </div>\r\n  \r\n  <div>\r\n  \r\n    <form >\r\n          <div class=\"form-group\">\r\n            <label for=\"field1c\" class=\"form-control-label\">Ime</label>\r\n            <input type=\"text\" [(ngModel)]=\"zgrada.ime\" placeholder=\"Ime\" \r\n               class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n          </div>\r\n  \r\n          <div class=\"form-group\">\r\n            <label for=\"field2c\" class=\"form-control-label\">Adresa</label>\r\n            <input type=\"text\" [(ngModel)]=\"zgrada.adresa\" placeholder=\"Adresa\" \r\n               class=\"form-control\" id=\"field2c\" name=\"field2\">\r\n          </div>\r\n         \r\n          <div class=\"form-group\">\r\n            <label for=\"field3c\" class=\"form-control-label\">Vlasnik</label>\r\n            <input type=\"text\" [(ngModel)]=\"zgrada.vlasnik.ime\" placeholder=\"Vlasnik\" \r\n               class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n          </div>\r\n     </form>\r\n    <div *ngIf=\"zgrada.id\">\r\n    <div>\r\n      <h3>kvarovi</h3>\r\n      <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAddKvar()\">\r\n        <span class=\"fa fa-plus\" aria-hidden=\"true\"></span>\r\n      </button>\r\n    </div>\r\n    <table class=\"table table-bordered\">\r\n      <tr *ngFor=\"let kvar of kvarovi\">\r\n        <td>\r\n        {{kvar.id}} {{kvar.ime}} {{kvar.opis}} {{kvar.kreator.ime}} {{kvar.datKreiranja}} {{kvar.datZakazivanja}} {{kvar.datPopravke}} {{kvar.popravljen}}{{kvar.radnik.ime}}\r\n        </td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary right\" aria-label=\"Delete\" (click)=\"deleteKvar(kvar.id)\">\r\n            <span class=\"fa fa-remove\" aria-hidden=\"true\"></span>\r\n          </button>\r\n        </td>\r\n      </tr>\r\n    </table>   \r\n  </div>\r\n</div>\r\n  \r\n  <div>\r\n    <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n    <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n  </div> "

/***/ }),

/***/ "../../../../../src/app/zgrada-detail/zgrada-detail.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ZgradaDetailComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common__ = __webpack_require__("../../../common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__zgrade_zgrada_service__ = __webpack_require__("../../../../../src/app/zgrade/zgrada.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__model_zgrada_model__ = __webpack_require__("../../../../../src/app/model/zgrada.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_switchMap__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/switchMap.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__model_korisnik_model__ = __webpack_require__("../../../../../src/app/model/korisnik.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__kvarovi_kvarovi_service__ = __webpack_require__("../../../../../src/app/kvarovi/kvarovi.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};








var ZgradaDetailComponent = /** @class */ (function () {
    function ZgradaDetailComponent(zgradaService, kvarService, route, location, router) {
        this.zgradaService = zgradaService;
        this.kvarService = kvarService;
        this.route = route;
        this.location = location;
        this.router = router;
        /* zgradaService.RegenerateData$.subscribe(() =>
           this.getKvarovi()
        );*/
        this.zgrada = new __WEBPACK_IMPORTED_MODULE_4__model_zgrada_model__["a" /* Zgrada */]({
            ime: '',
            adresa: '',
            brStanova: null,
            brNaseljenih: null,
            vlasnik: new __WEBPACK_IMPORTED_MODULE_6__model_korisnik_model__["a" /* Korisnik */]({
                ime: '',
                lozinka: '',
                korisIme: '',
                uloga: '',
            })
        });
        this.mode = 'ADD';
    }
    ZgradaDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        if (this.route.snapshot.params['id']) {
            this.mode = 'EDIT';
            // fetch student if we edit the existing student
            this.route.params
                .switchMap(function (params) {
                return _this.zgradaService.getZgrada(+params['id']);
            }) // convert to number
                .subscribe(function (zgrada) {
                _this.zgrada = _this.zgrada;
                _this.getKvarovi;
            });
        }
    };
    ZgradaDetailComponent.prototype.getKvarovi = function () {
        var _this = this;
        this.zgradaService.getZgradaKvar(this.zgrada.id).then(function (kvarovi) {
            return _this.kvarovi = kvarovi;
        });
    };
    ZgradaDetailComponent.prototype.save = function () {
        this.mode == 'ADD' ? this.add() : this.edit();
    };
    ZgradaDetailComponent.prototype.add = function () {
        var _this = this;
        this.zgradaService.addZgrada(this.zgrada)
            .then(function (zgrada) {
            _this.zgradaService.announceChange();
            _this.zgradaService.getZgrade();
        });
    };
    ZgradaDetailComponent.prototype.edit = function () {
        var _this = this;
        this.zgradaService.editZgrada(this.zgrada)
            .then(function (zgrada) {
            _this.zgradaService.announceChange();
            _this.goBack();
        });
    };
    ZgradaDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    ZgradaDetailComponent.prototype.gotoAddKvar = function () {
        this.router.navigate(['/addKvar'], { queryParams: { zgradaId: this.zgrada.id } });
    };
    ZgradaDetailComponent.prototype.deleteKvar = function (kvarId) {
        var _this = this;
        this.kvarService.deleteKvar(kvarId).then(function () { return _this.getKvarovi(); });
    };
    ZgradaDetailComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-zgrada-detail',
            template: __webpack_require__("../../../../../src/app/zgrada-detail/zgrada-detail.component.html"),
            styles: [__webpack_require__("../../../../../src/app/zgrada-detail/zgrada-detail.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__zgrade_zgrada_service__["a" /* ZgradaService */], __WEBPACK_IMPORTED_MODULE_7__kvarovi_kvarovi_service__["a" /* KvarService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], ZgradaDetailComponent);
    return ZgradaDetailComponent;
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
        var url = 'api/zgrada/all';
        return this.http.get(url)
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
        var url = "" + this.zgradeUrl;
        return this.http
            .put(url, JSON.stringify(zgrada), { headers: this.headers })
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
    ZgradaService.prototype.getZgradaKvar = function (zgradaId) {
        var url = this.zgradeUrl + "/" + zgradaId + "/kvar";
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
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

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Zgrade</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Ime</th>\r\n      <th>Adresa</th>\r\n      <th>Broj stanova</th>\r\n      <th>Broj naseljenih</th>\r\n      <th>Vlasnik</th>\r\n    </tr>\r\n    <tr *ngFor=\"let zgrada of zgrade\">\r\n      <td>{{zgrada.id}}</td>\r\n      <td><a class=\"nav-link\" [routerLink]=\"['/kvarovi']\">{{zgrada.ime}}</a></td>\r\n      <td>{{zgrada.adresa}}</td>\r\n      <td>{{zgrada.brStanova}}</td>\r\n      <td>{{zgrada.brNaseljenih}}</td>\r\n      <td>{{zgrada.vlasnik.ime}}</td>\r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(zgrada)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteZgrada(zgrada.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div> \r\n  "

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
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__zgrada_service__["a" /* ZgradaService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
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