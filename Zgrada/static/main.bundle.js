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

module.exports = "<div style=\"text-align:center\">\r\n  <h1>\r\n    Sistem za odrzavanje zgrada!\r\n  </h1>\r\n  <nav class=\"navbar navbar-toggleable-md navbar-light bg-faded\">\r\n    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n      <ul class=\"navbar-nav mr-auto\">\r\n        <li routerLinkActive=\"active current\">\r\n          <a class=\"nav-link\" [routerLink]=\"['/zgrade']\">Zgrade</a>\r\n          <a class=\"nav-link\" [routerLink]=\"['/stanovi']\">Stanovi</a>\r\n          <a class=\"nav-link\" [routerLink]=\"['/firme']\">Firme</a>\r\n          <a class=\"nav-link\" [routerLink]=\"['/kvarovi']\">Kvarovi</a>\r\n          <a class=\"nav-link\" [routerLink]=\"['/sednice']\">Sednice</a>\r\n          <a class=\"nav-link\" [routerLink]=\"['/komentari']\">Komentari</a>\r\n          <a class=\"nav-link\" [routerLink]=\"['/stavke']\">Stavke</a>\r\n          <a class=\"nav-link\" [routerLink]=\"['/zapisnici']\">Zapisnici</a>\r\n          <a class=\"nav-link\" [routerLink]=\"['/korisnici']\">Korisnici</a>\r\n        </li>\r\n       </ul>\r\n    </div>   \r\n  </nav>\r\n</div>\r\n<router-outlet></router-outlet>"

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
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__zgrade_zgrade_service__ = __webpack_require__("../../../../../src/app/zgrade/zgrade.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__stanovi_stanovi_component__ = __webpack_require__("../../../../../src/app/stanovi/stanovi.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__stanovi_stan_service__ = __webpack_require__("../../../../../src/app/stanovi/stan.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__firme_firme_component__ = __webpack_require__("../../../../../src/app/firme/firme.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__firme_firma_service__ = __webpack_require__("../../../../../src/app/firme/firma.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__firma_detail_firma_detail_component__ = __webpack_require__("../../../../../src/app/firma-detail/firma-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__zgrada_detail_zgrada_detail_component__ = __webpack_require__("../../../../../src/app/zgrada-detail/zgrada-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__stan_detail_stan_detail_component__ = __webpack_require__("../../../../../src/app/stan-detail/stan-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__korisnik_detail_korisnik_detail_component__ = __webpack_require__("../../../../../src/app/korisnik-detail/korisnik-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__komentar_detail_komentar_detail_component__ = __webpack_require__("../../../../../src/app/komentar-detail/komentar-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__komentari_komentari_component__ = __webpack_require__("../../../../../src/app/komentari/komentari.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_19__komentari_komentari_service__ = __webpack_require__("../../../../../src/app/komentari/komentari.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_20__sednice_sednice_component__ = __webpack_require__("../../../../../src/app/sednice/sednice.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_21__sednica_detail_sednica_detail_component__ = __webpack_require__("../../../../../src/app/sednica-detail/sednica-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_22__sednice_sednica_service__ = __webpack_require__("../../../../../src/app/sednice/sednica.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_23__stavke_stavke_component__ = __webpack_require__("../../../../../src/app/stavke/stavke.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_24__stavka_detail_stavka_detail_component__ = __webpack_require__("../../../../../src/app/stavka-detail/stavka-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_25__stavke_stavke_service__ = __webpack_require__("../../../../../src/app/stavke/stavke.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_26__ng_bootstrap_ng_bootstrap__ = __webpack_require__("../../../../@ng-bootstrap/ng-bootstrap/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_27__kvarovi_kvarovi_component__ = __webpack_require__("../../../../../src/app/kvarovi/kvarovi.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_28__kvar_detail_kvar_detail_component__ = __webpack_require__("../../../../../src/app/kvar-detail/kvar-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_29__kvarovi_kvarovi_service__ = __webpack_require__("../../../../../src/app/kvarovi/kvarovi.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_30__korisnici_korisnik_service__ = __webpack_require__("../../../../../src/app/korisnici/korisnik.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_31__korisnici_korisnici_component__ = __webpack_require__("../../../../../src/app/korisnici/korisnici.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_32__obavestenja_obavestenja_component__ = __webpack_require__("../../../../../src/app/obavestenja/obavestenja.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_33__obavestenje_detail_obavestenje_detail_component__ = __webpack_require__("../../../../../src/app/obavestenje-detail/obavestenje-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_34__obavestenja_obavestenja_service__ = __webpack_require__("../../../../../src/app/obavestenja/obavestenja.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_35__zapisnici_zapisnici_component__ = __webpack_require__("../../../../../src/app/zapisnici/zapisnici.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_36__zapisnik_detail_zapisnik_detail_component__ = __webpack_require__("../../../../../src/app/zapisnik-detail/zapisnik-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_37__zapisnici_zapisnici_service__ = __webpack_require__("../../../../../src/app/zapisnici/zapisnici.service.ts");
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
                __WEBPACK_IMPORTED_MODULE_27__kvarovi_kvarovi_component__["a" /* KvaroviComponent */],
                __WEBPACK_IMPORTED_MODULE_28__kvar_detail_kvar_detail_component__["a" /* KvarDetailComponent */],
                __WEBPACK_IMPORTED_MODULE_18__komentari_komentari_component__["a" /* KomentariComponent */],
                __WEBPACK_IMPORTED_MODULE_17__komentar_detail_komentar_detail_component__["a" /* KomentarDetailComponent */],
                __WEBPACK_IMPORTED_MODULE_31__korisnici_korisnici_component__["a" /* KorisniciComponent */],
                __WEBPACK_IMPORTED_MODULE_20__sednice_sednice_component__["a" /* SedniceComponent */],
                __WEBPACK_IMPORTED_MODULE_21__sednica_detail_sednica_detail_component__["a" /* SednicaDetailComponent */],
                __WEBPACK_IMPORTED_MODULE_32__obavestenja_obavestenja_component__["a" /* ObavestenjaComponent */],
                __WEBPACK_IMPORTED_MODULE_33__obavestenje_detail_obavestenje_detail_component__["a" /* ObavestenjeDetailComponent */],
                __WEBPACK_IMPORTED_MODULE_23__stavke_stavke_component__["a" /* StavkeComponent */],
                __WEBPACK_IMPORTED_MODULE_24__stavka_detail_stavka_detail_component__["a" /* StavkaDetailComponent */],
                __WEBPACK_IMPORTED_MODULE_35__zapisnici_zapisnici_component__["a" /* ZapisniciComponent */],
                __WEBPACK_IMPORTED_MODULE_36__zapisnik_detail_zapisnik_detail_component__["a" /* ZapisnikDetailComponent */]
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_26__ng_bootstrap_ng_bootstrap__["a" /* NgbModule */].forRoot(),
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_3__angular_http__["c" /* HttpModule */],
                __WEBPACK_IMPORTED_MODULE_4__app_routing__["a" /* routing */]
            ],
            providers: [__WEBPACK_IMPORTED_MODULE_8__zgrade_zgrade_service__["a" /* ZgradaService */], __WEBPACK_IMPORTED_MODULE_10__stanovi_stan_service__["a" /* StanService */], __WEBPACK_IMPORTED_MODULE_12__firme_firma_service__["a" /* FirmaService */], __WEBPACK_IMPORTED_MODULE_29__kvarovi_kvarovi_service__["a" /* KvarService */], __WEBPACK_IMPORTED_MODULE_19__komentari_komentari_service__["a" /* KomentarService */],
                __WEBPACK_IMPORTED_MODULE_34__obavestenja_obavestenja_service__["a" /* ObavestenjeService */], __WEBPACK_IMPORTED_MODULE_30__korisnici_korisnik_service__["a" /* KorisnikService */], __WEBPACK_IMPORTED_MODULE_22__sednice_sednica_service__["a" /* SednicaService */], __WEBPACK_IMPORTED_MODULE_25__stavke_stavke_service__["a" /* StavkaService */], __WEBPACK_IMPORTED_MODULE_37__zapisnici_zapisnici_service__["a" /* ZapisnikService */]],
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
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__korisnici_korisnici_component__ = __webpack_require__("../../../../../src/app/korisnici/korisnici.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__korisnik_detail_korisnik_detail_component__ = __webpack_require__("../../../../../src/app/korisnik-detail/korisnik-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__kvar_detail_kvar_detail_component__ = __webpack_require__("../../../../../src/app/kvar-detail/kvar-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__komentar_detail_komentar_detail_component__ = __webpack_require__("../../../../../src/app/komentar-detail/komentar-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__komentari_komentari_component__ = __webpack_require__("../../../../../src/app/komentari/komentari.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__kvarovi_kvarovi_component__ = __webpack_require__("../../../../../src/app/kvarovi/kvarovi.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__sednica_detail_sednica_detail_component__ = __webpack_require__("../../../../../src/app/sednica-detail/sednica-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__sednice_sednice_component__ = __webpack_require__("../../../../../src/app/sednice/sednice.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__obavestenja_obavestenja_component__ = __webpack_require__("../../../../../src/app/obavestenja/obavestenja.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__obavestenje_detail_obavestenje_detail_component__ = __webpack_require__("../../../../../src/app/obavestenje-detail/obavestenje-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__stavka_detail_stavka_detail_component__ = __webpack_require__("../../../../../src/app/stavka-detail/stavka-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__stavke_stavke_component__ = __webpack_require__("../../../../../src/app/stavke/stavke.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_19__zapisnik_detail_zapisnik_detail_component__ = __webpack_require__("../../../../../src/app/zapisnik-detail/zapisnik-detail.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_20__zapisnici_zapisnici_component__ = __webpack_require__("../../../../../src/app/zapisnici/zapisnici.component.ts");





















var routes = [
    { path: 'zgrade', component: __WEBPACK_IMPORTED_MODULE_1__zgrade_zgrade_component__["a" /* ZgradeComponent */] },
    { path: 'stanovi', component: __WEBPACK_IMPORTED_MODULE_2__stanovi_stanovi_component__["a" /* StanoviComponent */] },
    { path: 'firme', component: __WEBPACK_IMPORTED_MODULE_3__firme_firme_component__["a" /* FirmeComponent */] },
    { path: 'kvarovi', component: __WEBPACK_IMPORTED_MODULE_12__kvarovi_kvarovi_component__["a" /* KvaroviComponent */] },
    { path: 'sednice', component: __WEBPACK_IMPORTED_MODULE_14__sednice_sednice_component__["a" /* SedniceComponent */] },
    { path: 'komentari', component: __WEBPACK_IMPORTED_MODULE_11__komentari_komentari_component__["a" /* KomentariComponent */] },
    { path: 'stavke', component: __WEBPACK_IMPORTED_MODULE_18__stavke_stavke_component__["a" /* StavkeComponent */] },
    { path: 'zapisnici', component: __WEBPACK_IMPORTED_MODULE_20__zapisnici_zapisnici_component__["a" /* ZapisniciComponent */] },
    { path: 'korisnici', component: __WEBPACK_IMPORTED_MODULE_7__korisnici_korisnici_component__["a" /* KorisniciComponent */] },
    { path: 'addZgrada', component: __WEBPACK_IMPORTED_MODULE_4__zgrada_detail_zgrada_detail_component__["a" /* ZgradaDetailComponent */] },
    { path: 'editZgrada/:id', component: __WEBPACK_IMPORTED_MODULE_4__zgrada_detail_zgrada_detail_component__["a" /* ZgradaDetailComponent */] },
    { path: 'addFirma', component: __WEBPACK_IMPORTED_MODULE_5__firma_detail_firma_detail_component__["a" /* FirmaDetailComponent */] },
    { path: 'editFirma/:id', component: __WEBPACK_IMPORTED_MODULE_5__firma_detail_firma_detail_component__["a" /* FirmaDetailComponent */] },
    { path: 'addStan', component: __WEBPACK_IMPORTED_MODULE_6__stan_detail_stan_detail_component__["a" /* StanDetailComponent */] },
    { path: 'editStan/:id', component: __WEBPACK_IMPORTED_MODULE_6__stan_detail_stan_detail_component__["a" /* StanDetailComponent */] },
    { path: 'addKorisnik', component: __WEBPACK_IMPORTED_MODULE_8__korisnik_detail_korisnik_detail_component__["a" /* KorisnikDetailComponent */] },
    { path: 'editKorisnik/:id', component: __WEBPACK_IMPORTED_MODULE_8__korisnik_detail_korisnik_detail_component__["a" /* KorisnikDetailComponent */] },
    { path: 'addKvar', component: __WEBPACK_IMPORTED_MODULE_9__kvar_detail_kvar_detail_component__["a" /* KvarDetailComponent */] },
    { path: 'editKvar/:id', component: __WEBPACK_IMPORTED_MODULE_9__kvar_detail_kvar_detail_component__["a" /* KvarDetailComponent */] },
    { path: 'addKomentar', component: __WEBPACK_IMPORTED_MODULE_10__komentar_detail_komentar_detail_component__["a" /* KomentarDetailComponent */] },
    { path: 'editKomentar/:id', component: __WEBPACK_IMPORTED_MODULE_10__komentar_detail_komentar_detail_component__["a" /* KomentarDetailComponent */] },
    { path: 'addSednica', component: __WEBPACK_IMPORTED_MODULE_13__sednica_detail_sednica_detail_component__["a" /* SednicaDetailComponent */] },
    { path: 'editSednica/:id', component: __WEBPACK_IMPORTED_MODULE_13__sednica_detail_sednica_detail_component__["a" /* SednicaDetailComponent */] },
    { path: 'obavestenja', component: __WEBPACK_IMPORTED_MODULE_15__obavestenja_obavestenja_component__["a" /* ObavestenjaComponent */] },
    { path: 'addObavestenje', component: __WEBPACK_IMPORTED_MODULE_16__obavestenje_detail_obavestenje_detail_component__["a" /* ObavestenjeDetailComponent */] },
    { path: 'editObavestenje/:id', component: __WEBPACK_IMPORTED_MODULE_16__obavestenje_detail_obavestenje_detail_component__["a" /* ObavestenjeDetailComponent */] },
    { path: 'addStavka', component: __WEBPACK_IMPORTED_MODULE_17__stavka_detail_stavka_detail_component__["a" /* StavkaDetailComponent */] },
    { path: 'editStavka/:id', component: __WEBPACK_IMPORTED_MODULE_17__stavka_detail_stavka_detail_component__["a" /* StavkaDetailComponent */] },
    { path: 'addZapisnik', component: __WEBPACK_IMPORTED_MODULE_19__zapisnik_detail_zapisnik_detail_component__["a" /* ZapisnikDetailComponent */] },
    { path: 'editZapisnik/:id', component: __WEBPACK_IMPORTED_MODULE_19__zapisnik_detail_zapisnik_detail_component__["a" /* ZapisnikDetailComponent */] },
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

module.exports = "<div>\r\n    <h3>Firma {{firma.ime}}</h3>\r\n  </div>\r\n  \r\n  <div>\r\n  \r\n    <form >\r\n        <div class=\"form-group\">\r\n            <label for=\"field1c\" class=\"form-control-label\">Id</label>\r\n            <input type=\"text\" [(ngModel)]=\"firma.id\" placeholder=\"Id\" \r\n               class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n          </div>\r\n\r\n          <div class=\"form-group\">\r\n            <label for=\"field2c\" class=\"form-control-label\">Ime</label>\r\n            <input type=\"text\" [(ngModel)]=\"firma.ime\" placeholder=\"Ime\" \r\n               class=\"form-control\" id=\"field2c\" name=\"field2\">\r\n          </div>\r\n  \r\n          <div class=\"form-group\">\r\n            <label for=\"field3c\" class=\"form-control-label\">Adresa</label>\r\n            <input type=\"text\" [(ngModel)]=\"firma.adresa\" placeholder=\"Adresa\" \r\n               class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n          </div>\r\n         \r\n          <div class=\"form-group\">\r\n            <label for=\"field4c\" class=\"form-control-label\">Telefon</label>\r\n            <input type=\"text\" [(ngModel)]=\"firma.telefon\" placeholder=\"Telefon\" \r\n               class=\"form-control\" id=\"field4c\" name=\"field4\">\r\n          </div>\r\n\r\n          <div class=\"form-group\">\r\n            <label for=\"field5c\" class=\"form-control-label\">Email</label>\r\n            <input type=\"text\" [(ngModel)]=\"firma.email\" placeholder=\"Email\" \r\n               class=\"form-control\" id=\"field5c\" name=\"field5\">\r\n          </div>\r\n\r\n          <div class=\"form-group\">\r\n            <label for=\"field6c\" class=\"form-control-label\">Web site</label>\r\n            <input type=\"text\" [(ngModel)]=\"firma.webSite\" placeholder=\"WebSite\" \r\n               class=\"form-control\" id=\"field6c\" name=\"field6\">\r\n          </div>\r\n          <div class=\"form-group\">\r\n              <label for=\"field7c\" class=\"form-control-label\">Vlasnik</label>\r\n              <input type=\"text\" [(ngModel)]=\"firma.vlasnik.korisIme\" placeholder=\"Vlasnik\" \r\n                 class=\"form-control\" id=\"field7c\" name=\"field7\">\r\n            </div>\r\n\r\n          \r\n     </form>\r\n    \r\n  \r\n  </div>\r\n  <div>\r\n    <button class=\"btn btn-primary\" (click)=\"goBack()\" style=\"font-size:18px;color:darkgreen\">Cancel</button>\r\n    <button class=\"btn btn-primary\" (click)=\"save()\" style=\"font-size:18px;color:darkgreen\">OK</button>\r\n  </div> "

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
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__korisnici_korisnik_service__ = __webpack_require__("../../../../../src/app/korisnici/korisnik.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__model_korisnik_model__ = __webpack_require__("../../../../../src/app/model/korisnik.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7_rxjs_add_operator_switchMap__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/switchMap.js");
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
    function FirmaDetailComponent(firmaService, korisnikService, route, location, router) {
        this.firmaService = firmaService;
        this.korisnikService = korisnikService;
        this.route = route;
        this.location = location;
        this.router = router;
        this.firma = new __WEBPACK_IMPORTED_MODULE_4__model_firma_model__["a" /* Firma */]({
            adresa: '',
            ime: '',
            telefon: null,
            email: '',
            webSite: '',
            vlasnik: new __WEBPACK_IMPORTED_MODULE_6__model_korisnik_model__["a" /* Korisnik */]({
                ime: '',
                lozinka: '',
                korisIme: '',
                uloga: '',
            })
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
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__firme_firma_service__["a" /* FirmaService */], __WEBPACK_IMPORTED_MODULE_5__korisnici_korisnik_service__["a" /* KorisnikService */],
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

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Firme</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Ime</th>\r\n      <th>Adresa</th>\r\n      <th>Telefon</th>\r\n      <th>Email</th>\r\n      <th>Web site</th>\r\n      <th>Vlasnik</th>\r\n    </tr>\r\n    <tr *ngFor=\"let firma of firme\">\r\n      <td>\r\n        {{firma.id}}\r\n      </td>\r\n      <td>\r\n        {{firma.ime}}\r\n      </td>\r\n      <td>\r\n        {{firma.adresa}}\r\n      </td>\r\n      <td>\r\n        {{firma.telefon}}\r\n      </td>\r\n      <td>\r\n        {{firma.email}}\r\n      </td>\r\n      <td>\r\n        {{firma.webSite}}\r\n      </td>\r\n      <td>\r\n        {{firma.vlasnik.korisIme}}\r\n      </td>\r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(firma)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteFirma(firma.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div> \r\n  "

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

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n<div>\r\n  <h3>Komentar</h3>\r\n</div>\r\n\r\n<div>\r\n    <form>\r\n      <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Id</label>\r\n          <input type=\"text\" [(ngModel)]=\"komentar.id\" placeholder=id \r\n          class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n      </div>\r\n      <div class=\"form-group\">\r\n          <label for=\"field2c\" class=\"form-control-label\">Text</label>\r\n            <input type=\"text\" [(ngModel)]=\"komentar.text\" placeholder=\"Text\" \r\n            class=\"form-control\" id=\"field2c\" name=\"field2\">\r\n      </div>\r\n        <div class=\"form-group\">\r\n            <div class=\"input-group\">\r\n                <label for=\"field3c\" class=\"form-control-label\">Datum kreiranja</label>\r\n              <input class=\"form-control\" placeholder=\"yyyy-mm-dd\" name=\"dp1\" [(ngModel)]=\"ngbDatKreiranja\" \r\n                ngbDatepicker #d1=\"ngbDatepicker\">\r\n              <button class=\"input-group-addon\" (click)=\"d1.toggle()\" type=\"button\">\r\n              <i class=\"fa fa-calendar\" style=\"width: 1.2rem; height: 1rem; cursor: pointer;\"> </i> \r\n            </button>\r\n            </div>\r\n          </div>\r\n          <div class=\"form-group\">\r\n              <label for=\"field4c\" class=\"form-control-label\">Kreator</label>\r\n                <input type=\"text\" [(ngModel)]=\"komentar.kreator.korisIme\" placeholder=\"kreator\" \r\n                class=\"form-control\" id=\"field4c\" name=\"field4\">\r\n            </div>\r\n            <div class=\"form-group\">\r\n                <label for=\"field5c\" class=\"form-control-label\">Kvar</label>\r\n                  <input type=\"text\" [(ngModel)]=\"komentar.kvar.id\" placeholder=\"kvar\" \r\n                  class=\"form-control\" id=\"field5c\" name=\"field5\">\r\n              </div>\r\n \r\n<div>\r\n\r\n  <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n  <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n</div>"

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
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__zgrade_zgrade_service__ = __webpack_require__("../../../../../src/app/zgrade/zgrade.service.ts");
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
    function KomentarDetailComponent(komentarService, kvarService, korisnikService, zgradaService, route, location, router) {
        /*komentarService.RegenerateData$.subscribe(() =>
          this.getEnrollments()
        );*/
        this.komentarService = komentarService;
        this.kvarService = kvarService;
        this.korisnikService = korisnikService;
        this.zgradaService = zgradaService;
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
                })
            })
        });
        this.mode = 'ADD';
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
            });
            this.route.queryParams.subscribe(function (params) {
                return _this.korisnikService.getKorisnik(params['kreatorId'])
                    .then(function (kreator) {
                    return _this.komentar.kreator = kreator;
                });
            });
            this.route.queryParams.subscribe(function (params) {
                return _this.kvarService.getKvar(params['kvarId'])
                    .then(function (kvar) {
                    return _this.komentar.kvar = kvar;
                });
            });
        }
    };
    KomentarDetailComponent.prototype.save = function () {
        this.mode == 'ADD' ? this.add() : this.edit();
    };
    KomentarDetailComponent.prototype.add = function () {
        var _this = this;
        this.komentar.datKreiranja = new Date(this.ngbDatKreiranja.year, this.ngbDatKreiranja.month - 1, this.ngbDatKreiranja.day);
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
            __WEBPACK_IMPORTED_MODULE_10__korisnici_korisnik_service__["a" /* KorisnikService */], __WEBPACK_IMPORTED_MODULE_11__zgrade_zgrade_service__["a" /* ZgradaService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], KomentarDetailComponent);
    return KomentarDetailComponent;
}());



/***/ }),

/***/ "../../../../../src/app/komentari/komentari.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/komentari/komentari.component.html":
/***/ (function(module, exports) {

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Komentari</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Text</th>\r\n      <th>Datum kreiranja</th>\r\n      <th>Kreator</th>\r\n      <th>Kvar</th>\r\n    </tr>\r\n    <tr *ngFor=\"let komentar of komentari\">\r\n      <td>{{komentar.id}}</td>\r\n      <td>{{komentar.text}}</td>\r\n      <td>{{komentar.datKreiranja  | date: 'dd.MM.yyyy'}}</td>\r\n      <td>{{komentar.kreator.korisIme}}</td>\r\n      <td>{{komentar.kvar.id}}</td>\r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(komentar)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteKomentar(komentar.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div>"

/***/ }),

/***/ "../../../../../src/app/komentari/komentari.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return KomentariComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__komentari_service__ = __webpack_require__("../../../../../src/app/komentari/komentari.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var KomentariComponent = /** @class */ (function () {
    function KomentariComponent(komentarService, router) {
        var _this = this;
        this.komentarService = komentarService;
        this.router = router;
        this.subscription = komentarService.RegenerateData$.subscribe(function () {
            return _this.getKomentari();
        });
    }
    KomentariComponent.prototype.ngOnInit = function () {
        this.getKomentari();
    };
    KomentariComponent.prototype.getKomentari = function () {
        var _this = this;
        this.komentarService.getKomentari().then(function (komentari) {
            return _this.komentari = komentari;
        });
    };
    KomentariComponent.prototype.gotoAdd = function () {
        this.router.navigate(['/addKomentar']);
    };
    KomentariComponent.prototype.gotoEdit = function (komentar) {
        this.router.navigate(['/editKomentar', komentar.id]);
    };
    KomentariComponent.prototype.deleteKomentar = function (komentariId) {
        var _this = this;
        this.komentarService.deleteKomentar(komentariId).then(function () { return _this.getKomentari(); });
    };
    KomentariComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'komentari-list',
            template: __webpack_require__("../../../../../src/app/komentari/komentari.component.html"),
            styles: [__webpack_require__("../../../../../src/app/komentari/komentari.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__komentari_service__["a" /* KomentarService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], KomentariComponent);
    return KomentariComponent;
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
        return this.http.get('api/komentar/all')
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

/***/ "../../../../../src/app/korisnici/korisnici.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/korisnici/korisnici.component.html":
/***/ (function(module, exports) {

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n<div>\r\n    <h3>Korisnici</h3>\r\n  </div>\r\n  <table class=\"table table-bordered\">\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Ime</th>\r\n      <th>Korisnicko ime</th>\r\n      <th>Uloga</th>\r\n      <th></th>\r\n    </tr>\r\n    <tr *ngFor=\"let korisnik of korisnici\">\r\n      <td>\r\n        {{korisnik.id}}\r\n      </td>\r\n      <td>\r\n        {{korisnik.ime}}\r\n      </td>\r\n      <td>\r\n        {{korisnik.korisIme}}\r\n      </td>\r\n      <td>\r\n        {{korisnik.uloga}}\r\n      </td>\r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Edit\" (click)=\"gotoEdit(korisnik)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteKorisnik(korisnik.id)\">\r\n          <span class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\" >\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div> \r\n  "

/***/ }),

/***/ "../../../../../src/app/korisnici/korisnici.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return KorisniciComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__korisnik_service__ = __webpack_require__("../../../../../src/app/korisnici/korisnik.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var KorisniciComponent = /** @class */ (function () {
    function KorisniciComponent(korisnikService, router) {
        var _this = this;
        this.korisnikService = korisnikService;
        this.router = router;
        this.subscription = korisnikService.RegenerateData$.subscribe(function () {
            return _this.getKorisnici();
        });
    }
    KorisniciComponent.prototype.ngOnInit = function () {
        this.getKorisnici();
    };
    KorisniciComponent.prototype.getKorisnici = function () {
        var _this = this;
        this.korisnikService.getKorisnici().then(function (korisnici) {
            return _this.korisnici = korisnici;
        });
    };
    KorisniciComponent.prototype.gotoAdd = function () {
        this.router.navigate(['/addKorisnik']);
    };
    KorisniciComponent.prototype.gotoEdit = function (korisnik) {
        this.router.navigate(['/editKorisnik', korisnik.id]);
    };
    KorisniciComponent.prototype.deleteKorisnik = function (korisnikId) {
        var _this = this;
        this.korisnikService.deleteKorisnik(korisnikId).then(function () { return _this.getKorisnici(); });
    };
    KorisniciComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'korisnici-list',
            template: __webpack_require__("../../../../../src/app/korisnici/korisnici.component.html"),
            styles: [__webpack_require__("../../../../../src/app/korisnici/korisnici.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__korisnik_service__["a" /* KorisnikService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], KorisniciComponent);
    return KorisniciComponent;
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




var KorisnikService = /** @class */ (function () {
    function KorisnikService(http) {
        this.http = http;
        this.korisniciUrl = 'api/korisnik_servisa';
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        this.RegenerateData = new __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__["a" /* Subject */]();
        this.RegenerateData$ = this.RegenerateData.asObservable();
    }
    KorisnikService.prototype.announceChange = function () {
        this.RegenerateData.next();
    };
    KorisnikService.prototype.getKorisnici = function () {
        var url = 'api/korisnik_servisa/all';
        return this.http.get(url)
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

module.exports = "<div>\r\n    <h3>Korisnik</h3>\r\n  </div>\r\n  \r\n  <div>\r\n  \r\n    <form >\r\n          <div class=\"form-group\">\r\n            <label for=\"field1c\" class=\"form-control-label\">Id</label>\r\n            <input type=\"text\" [(ngModel)]=\"korisnik.id\" placeholder=\"Id\" \r\n               class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n          </div>\r\n          <div class=\"form-group\">\r\n              <label for=\"field2c\" class=\"form-control-label\">Ime</label>\r\n              <input type=\"text\" [(ngModel)]=\"korisnik.ime\" placeholder=\"Ime\" \r\n                 class=\"form-control\" id=\"field2c\" name=\"field2\">\r\n            </div>\r\n  \r\n          <div class=\"form-group\">\r\n            <label for=\"field3c\" class=\"form-control-label\">Korisnicko ime</label>\r\n            <input type=\"text\" [(ngModel)]=\"korisnik.korisIme\" placeholder=\"Koris Ime\" \r\n               class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n          </div>\r\n         \r\n          <div class=\"form-group\">\r\n            <label for=\"field4c\" class=\"form-control-label\">Lozinka</label>\r\n            <input type=\"password\" [(ngModel)]=\"korisnik.lozinka\" placeholder=\"Lozinka\" \r\n               class=\"form-control\" id=\"field4c\" name=\"field4\">\r\n          </div>\r\n          <div class=\"form-group\">\r\n            <label for=\"field5c\" class=\"form-control-label\">Uloga</label>\r\n            <input type=\"text\" [(ngModel)]=\"korisnik.uloga\" placeholder=\"Uloga\" \r\n               class=\"form-control\" id=\"field5c\" name=\"field5\">\r\n          </div>\r\n\r\n     </form>\r\n    \r\n  \r\n  </div>\r\n  <div>\r\n    <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n    <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n  </div> "

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

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n  <h3>Kvar</h3>\r\n</div>\r\n\r\n<div>\r\n  <form>\r\n    <div class=\"form-group\">\r\n      <label for=\"field1c\" class=\"form-control-label\">Id</label>\r\n        <input type=\"text\" [(ngModel)]=\"kvar.id\" placeholder=id \r\n        class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n    </div>\r\n    <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Ime</label>\r\n          <input type=\"text\" [(ngModel)]=\"kvar.ime\" placeholder=\"Name\" \r\n          class=\"form-control\" id=\"field2c\" name=\"field2\">\r\n    </div>\r\n    <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Opis</label>\r\n          <input type=\"text\" [(ngModel)]=\"kvar.opis\" placeholder=\"Opis\" \r\n          class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n      </div>\r\n      <div class=\"form-group\">\r\n          <div class=\"input-group\">\r\n              <label for=\"field1c\" class=\"form-control-label\">Datum kreiranja</label>\r\n            <input class=\"form-control\" placeholder=\"yyyy-mm-dd\" name=\"dp1\" [(ngModel)]=\"ngbDatKreiranja\" \r\n              ngbDatepicker #d1=\"ngbDatepicker\">\r\n            <button class=\"input-group-addon\" (click)=\"d1.toggle()\" type=\"button\">\r\n            <i class=\"fa fa-calendar\" style=\"width: 1.2rem; height: 1rem; cursor: pointer;\"> </i> \r\n          </button>\r\n          </div>\r\n        </div>\r\n    <div class=\"form-group\">\r\n          <div class=\"input-group\">\r\n              <label for=\"field1c\" class=\"form-control-label\">Datum zakazivanja</label>\r\n            <input class=\"form-control\" placeholder=\"yyyy-mm-dd\" name=\"dp2\" [(ngModel)]=\"ngbDatZakazivanja\" \r\n              ngbDatepicker #d2=\"ngbDatepicker\">\r\n            <button class=\"input-group-addon\" (click)=\"d2.toggle()\" type=\"button\">\r\n            <i class=\"fa fa-calendar\" style=\"width: 1.2rem; height: 1rem; cursor: pointer;\"> </i> \r\n          </button>\r\n          </div>\r\n        </div>\r\n        <div class=\"form-group\">\r\n            <div class=\"input-group\">\r\n                <label for=\"field1c\" class=\"form-control-label\">Datum popravke</label>\r\n              <input class=\"form-control\" placeholder=\"yyyy-mm-dd\" name=\"dp3\" [(ngModel)]=\"ngbDatPopravke\" \r\n                ngbDatepicker #d3=\"ngbDatepicker\">\r\n              <button class=\"input-group-addon\" (click)=\"d3.toggle()\" type=\"button\">\r\n              <i class=\"fa fa-calendar\" style=\"width: 1.2rem; height: 1rem; cursor: pointer;\"> </i> \r\n            </button>\r\n            </div>\r\n          </div>\r\n        <div class=\"form-group\">\r\n            <label for=\"field1c\" class=\"form-control-label\">Kreator</label>\r\n              <input type=\"text\" [(ngModel)]=\"kvar.kreator.korisIme\" placeholder=\"kreator\" \r\n              class=\"form-control\" id=\"field7c\" name=\"field7\">\r\n          </div>\r\n          <div class=\"form-group\">\r\n              <label for=\"field1c\" class=\"form-control-label\">Zgrada</label>\r\n                <input type=\"text\" [(ngModel)]=\"kvar.zgrada.id\" placeholder=\"zgrada\" \r\n                class=\"form-control\" id=\"field8c\" name=\"field8\">\r\n            </div>\r\n      \r\n    \r\n</form>\r\n<div *ngIf=\"kvar.id\">\r\n    <div>\r\n      <h3>Komentari</h3>\r\n      <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAddKomentar()\">\r\n        <span class=\"fa fa-plus\" aria-hidden=\"true\"></span>\r\n      </button>\r\n    </div>\r\n    <table class=\"table table-bordered\">\r\n      <tr *ngFor=\"let komentar of komentari\">\r\n        <td>\r\n        {{komentar.id}} {{komentar.ime}} {{komentar.opis}} {{komentar.kreator.ime}} {{komentar.datKreiranja}}\r\n        </td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary right\" aria-label=\"Delete\" (click)=\"deleteKomentar(komentar.id)\">\r\n            <span class=\"fa fa-remove\" aria-hidden=\"true\"></span>\r\n          </button>\r\n        </td>\r\n      </tr>\r\n    </table>   \r\n  </div>\r\n</div>\r\n \r\n<div>\r\n  <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n  <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n</div>"

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
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__zgrade_zgrade_service__ = __webpack_require__("../../../../../src/app/zgrade/zgrade.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__korisnici_korisnik_service__ = __webpack_require__("../../../../../src/app/korisnici/korisnik.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__komentari_komentari_service__ = __webpack_require__("../../../../../src/app/komentari/komentari.service.ts");
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
    function KvarDetailComponent(kvarService, zgradaService, korisnikService, komentarService, route, location, router) {
        var _this = this;
        this.kvarService = kvarService;
        this.zgradaService = zgradaService;
        this.korisnikService = korisnikService;
        this.komentarService = komentarService;
        this.route = route;
        this.location = location;
        this.router = router;
        komentarService.RegenerateData$.subscribe(function () {
            return _this.getKomentari();
        });
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
            })
            /*radnik: new Korisnik({
              ime: '',
              lozinka: '',
              korisIme: '',
              uloga: '',
            })*/
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
                _this.getKomentari();
            });
            this.route.queryParams.subscribe(function (params) {
                return _this.zgradaService.getZgrada(params['zgradaId'])
                    .then(function (zgrada) {
                    return _this.kvar.zgrada = zgrada;
                });
            });
        }
    };
    KvarDetailComponent.prototype.getKomentari = function () {
        var _this = this;
        this.kvarService.getKvarKomentar(this.kvar.id).then(function (komentari) {
            return _this.komentari = komentari;
        });
    };
    KvarDetailComponent.prototype.save = function () {
        this.mode == 'ADD' ? this.add() : this.edit();
    };
    KvarDetailComponent.prototype.add = function () {
        var _this = this;
        this.kvar.datKreiranja = new Date(this.ngbDatKreiranja.year, this.ngbDatKreiranja.month - 1, this.ngbDatKreiranja.day);
        this.kvarService.addKvar(this.kvar)
            .then(function (kvar) {
            _this.kvarService.announceChange();
            _this.goBack();
        });
    };
    KvarDetailComponent.prototype.edit = function () {
        var _this = this;
        this.kvar.datZakazivanja = new Date(this.ngbDatZakazivanja.year, this.ngbDatZakazivanja.month - 1, this.ngbDatZakazivanja.day);
        this.kvar.datPopravke = new Date(this.ngbDatPopravke.year, this.ngbDatPopravke.month - 1, this.ngbDatPopravke.day);
        this.kvarService.editKvar(this.kvar)
            .then(function (kvar) {
            _this.kvarService.announceChange();
            _this.goBack();
        });
    };
    KvarDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    KvarDetailComponent.prototype.gotoAddKomentar = function () {
        this.router.navigate(['/addKomentar'], { queryParams: { kvarId: this.kvar.id } });
    };
    KvarDetailComponent.prototype.deleteKomentar = function (komentarId) {
        var _this = this;
        this.komentarService.deleteKomentar(komentarId).then(function () { return _this.getKomentari(); });
    };
    KvarDetailComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-kvar-detail',
            template: __webpack_require__("../../../../../src/app/kvar-detail/kvar-detail.component.html"),
            styles: [__webpack_require__("../../../../../src/app/kvar-detail/kvar-detail.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__kvarovi_kvarovi_service__["a" /* KvarService */], __WEBPACK_IMPORTED_MODULE_8__zgrade_zgrade_service__["a" /* ZgradaService */],
            __WEBPACK_IMPORTED_MODULE_9__korisnici_korisnik_service__["a" /* KorisnikService */], __WEBPACK_IMPORTED_MODULE_10__komentari_komentari_service__["a" /* KomentarService */],
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

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Kvarovi</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Ime</th>\r\n      <th>Opis</th>\r\n      <th>Datum kreiranja</th>\r\n      <th>Datum zakazivanja</th>\r\n      <th>Datum popravke</th>\r\n      <th>Kreator</th>\r\n      \r\n    </tr>\r\n    <tr *ngFor=\"let kvar of kvarovi\">\r\n      <td>{{kvar.id}}</td>\r\n      <td>{{kvar.ime}}</td>\r\n      <td>{{kvar.opis}}</td>\r\n      <td>{{kvar.datKreiranja  | date: 'dd.MM.yyyy'}}</td>\r\n      <td>{{kvar.datZakazivanja  | date: 'dd.MM.yyyy'}}</td>\r\n      <td>{{kvar.datPopravke  | date: 'dd.MM.yyyy'}}</td>\r\n      <td>{{kvar.kreator.korisIme}}</td>\r\n      \r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(kvar)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteKvar(kvar.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div>"

/***/ }),

/***/ "../../../../../src/app/kvarovi/kvarovi.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return KvaroviComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__kvarovi_service__ = __webpack_require__("../../../../../src/app/kvarovi/kvarovi.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__komentari_komentari_service__ = __webpack_require__("../../../../../src/app/komentari/komentari.service.ts");
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
    function KvaroviComponent(kvarService, komentarService, router) {
        var _this = this;
        this.kvarService = kvarService;
        this.komentarService = komentarService;
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
            return _this.kvarovi = kvarovi;
        });
    };
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
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__kvarovi_service__["a" /* KvarService */], __WEBPACK_IMPORTED_MODULE_3__komentari_komentari_service__["a" /* KomentarService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
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
        var url = this.kvaroviUrl + "/" + id;
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
    KvarService.prototype.getKvarKomentar = function (kvarId) {
        var url = this.kvaroviUrl + "/" + kvarId + "/komentar";
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
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
        this.vlasnik = firmaCfg.vlasnik;
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
    //radnik: Korisnik;
    function Kvar(kvarCfg) {
        this.id = kvarCfg.id;
        this.ime = kvarCfg.ime;
        this.datKreiranja = kvarCfg.datKreiranja;
        this.datZakazivanja = kvarCfg.datZakazivanja;
        this.datPopravke = kvarCfg.datPopravke;
        this.opis = kvarCfg.opis;
        this.popravljen = kvarCfg.popravljen;
        this.kreator = kvarCfg.kreator;
        //this.radnik = kvarCfg.radnik;
        this.zgrada = kvarCfg.zgrada;
    }
    return Kvar;
}());



/***/ }),

/***/ "../../../../../src/app/model/obavestenje.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Obavestenje; });
var Obavestenje = /** @class */ (function () {
    function Obavestenje(obavestenjeCfg) {
        this.id = obavestenjeCfg.id;
        this.datKreiranja = obavestenjeCfg.datKreiranja;
        this.ime = obavestenjeCfg.ime;
        this.opis = obavestenjeCfg.opis;
        this.kreator = obavestenjeCfg.kreator;
        this.zgrada = obavestenjeCfg.zgrada;
    }
    return Obavestenje;
}());



/***/ }),

/***/ "../../../../../src/app/model/sednica.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Sednica; });
var Sednica = /** @class */ (function () {
    function Sednica(sednicaCfg) {
        this.id = sednicaCfg.id;
        this.aktivna = sednicaCfg.aktivna;
        this.datKreiranja = sednicaCfg.datKreiranja;
        this.datZakazivanja = sednicaCfg.datZakazivanja;
        this.kreator = sednicaCfg.kreator;
        this.zgrada = sednicaCfg.zgrada;
    }
    return Sednica;
}());



/***/ }),

/***/ "../../../../../src/app/model/stan.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Stan; });
var Stan = /** @class */ (function () {
    function Stan(stanCfg) {
        this.id = stanCfg.id;
        this.adresa = stanCfg.adresa;
        this.brStanovnika = stanCfg.brStanovnika;
        this.ime = stanCfg.ime;
        this.vlasnik = stanCfg.vlasnik;
        this.zgrada = stanCfg.zgrada;
    }
    return Stan;
}());



/***/ }),

/***/ "../../../../../src/app/model/stavka.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Stavka; });
var Stavka = /** @class */ (function () {
    function Stavka(stavkaCfg) {
        this.id = stavkaCfg.id;
        this.datKreiranja = stavkaCfg.datKreiranja;
        this.ime = stavkaCfg.ime;
        this.opis = stavkaCfg.opis;
        this.kreator = stavkaCfg.kreator;
        this.sednica = stavkaCfg.sednica;
    }
    return Stavka;
}());



/***/ }),

/***/ "../../../../../src/app/model/zapisnik.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Zapisnik; });
var Zapisnik = /** @class */ (function () {
    function Zapisnik(zapisnikCfg) {
        this.id = zapisnikCfg.id;
        this.datKreiranja = zapisnikCfg.datKreiranja;
        this.opis = zapisnikCfg.opis;
        this.kreator = zapisnikCfg.kreator;
        this.zgrada = zapisnikCfg.zgrada;
        this.sednica = zapisnikCfg.sednica;
    }
    return Zapisnik;
}());



/***/ }),

/***/ "../../../../../src/app/model/zgrada.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Zgrada; });
var Zgrada = /** @class */ (function () {
    function Zgrada(zgradaCfg) {
        this.id = zgradaCfg.id;
        this.adresa = zgradaCfg.adresa;
        this.brNaseljenih = zgradaCfg.brNaseljenih;
        this.brStanova = zgradaCfg.brStanova;
        this.ime = zgradaCfg.ime;
        this.vlasnik = zgradaCfg.vlasnik;
    }
    return Zgrada;
}());



/***/ }),

/***/ "../../../../../src/app/obavestenja/obavestenja.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/obavestenja/obavestenja.component.html":
/***/ (function(module, exports) {

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Obavestenja</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Ime</th>\r\n      <th>Opis</th>\r\n      <th>Datum kreiranja</th>\r\n      <th>Kreator</th>\r\n      <th>Zgrada</th>\r\n      \r\n    </tr>\r\n    <tr *ngFor=\"let obavestenje of obavestenja\">\r\n      <td>{{obavestenje.id}}</td>\r\n      <td>{{obavestenje.ime}}</td>\r\n      <td>{{obavestenje.opis}}</td>\r\n      <td>{{obavestenje.DatKreiranja}}</td>\r\n      <td>{{obavestenje.kreator.korisIme}}</td>\r\n      <td>{{obavestenje.zgrada.ime}}</td>\r\n      \r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(obavestenje)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteObavestenje(obavestenje.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div>"

/***/ }),

/***/ "../../../../../src/app/obavestenja/obavestenja.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ObavestenjaComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__obavestenja_service__ = __webpack_require__("../../../../../src/app/obavestenja/obavestenja.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var ObavestenjaComponent = /** @class */ (function () {
    function ObavestenjaComponent(obavestenjeService, router) {
        var _this = this;
        this.obavestenjeService = obavestenjeService;
        this.router = router;
        this.subscription = obavestenjeService.RegenerateData$.subscribe(function () {
            return _this.getObavestenja();
        });
    }
    ObavestenjaComponent.prototype.ngOnInit = function () {
        this.getObavestenja();
    };
    ObavestenjaComponent.prototype.getObavestenja = function () {
        var _this = this;
        this.obavestenjeService.getObavestenja().then(function (obavestenja) {
            return _this.obavestenja = obavestenja;
        });
    };
    ObavestenjaComponent.prototype.gotoAdd = function () {
        this.router.navigate(['/addobavestenje']);
    };
    ObavestenjaComponent.prototype.gotoEdit = function (obavestenje) {
        this.router.navigate(['/editObavestenje', obavestenje.id]);
    };
    ObavestenjaComponent.prototype.deleteObavestenje = function (obavestenjaId) {
        var _this = this;
        this, this.obavestenjeService.deleteObavestenje(obavestenjaId).then(function () { return _this.getObavestenja(); });
    };
    ObavestenjaComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'obavestenja-list',
            template: __webpack_require__("../../../../../src/app/obavestenja/obavestenja.component.html"),
            styles: [__webpack_require__("../../../../../src/app/obavestenja/obavestenja.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__obavestenja_service__["a" /* ObavestenjeService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], ObavestenjaComponent);
    return ObavestenjaComponent;
}());



/***/ }),

/***/ "../../../../../src/app/obavestenja/obavestenja.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ObavestenjeService; });
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




var ObavestenjeService = /** @class */ (function () {
    function ObavestenjeService(http) {
        this.http = http;
        this.obavestenjaUrl = 'api/obavestenje';
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        this.RegenerateData = new __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__["a" /* Subject */]();
        this.RegenerateData$ = this.RegenerateData.asObservable();
    }
    ObavestenjeService.prototype.announceChange = function () {
        this.RegenerateData.next();
    };
    ObavestenjeService.prototype.getObavestenja = function () {
        return this.http.get("api/obavestenje/all")
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    ObavestenjeService.prototype.getObavestenje = function (id) {
        var url = this.obavestenjaUrl + "/" + id;
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    ObavestenjeService.prototype.addObavestenje = function (obavestenje) {
        return this.http
            .post(this.obavestenjaUrl, JSON.stringify(obavestenje), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    ObavestenjeService.prototype.editObavestenje = function (obavestenje) {
        return this.http
            .put(this.obavestenjaUrl, JSON.stringify(obavestenje), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    ObavestenjeService.prototype.deleteObavestenje = function (obavestenjeId) {
        var url = this.obavestenjaUrl + "/" + this.obavestenjaUrl;
        return this.http
            .delete(url)
            .toPromise()
            .catch(this.handleError);
    };
    ObavestenjeService.prototype.handleError = function (error) {
        console.error("Error... ", error);
        return Promise.reject(error.message || error);
    };
    ObavestenjeService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]])
    ], ObavestenjeService);
    return ObavestenjeService;
}());



/***/ }),

/***/ "../../../../../src/app/obavestenje-detail/obavestenje-detail.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/obavestenje-detail/obavestenje-detail.component.html":
/***/ (function(module, exports) {

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n  <h3>Obavestenje</h3>\r\n</div>\r\n\r\n<div>\r\n  <form>\r\n    <div class=\"form-group\">\r\n      <label for=\"field1c\" class=\"form-control-label\">Id</label>\r\n        <input type=\"text\" [(ngModel)]=\"obavestenje.id\" placeholder=id \r\n        class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n    </div>\r\n    <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Ime</label>\r\n          <input type=\"text\" [(ngModel)]=\"obavestenje.ime\" placeholder=\"Name\" \r\n          class=\"form-control\" id=\"field2c\" name=\"field2\">\r\n    </div>\r\n    <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Opis</label>\r\n          <input type=\"text\" [(ngModel)]=\"obavestenje.opis\" placeholder=\"Opis\" \r\n          class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n      </div>\r\n      <div class=\"form-group\">\r\n          <div class=\"input-group\">\r\n              <label for=\"field1c\" class=\"form-control-label\">Datum kreiranja</label>\r\n            <input class=\"form-control\" placeholder=\"yyyy-mm-dd\" name=\"dp1\" [(ngModel)]=\"ngbDatKreiranja\" \r\n              ngbDatepicker #d1=\"ngbDatepicker\">\r\n            <button class=\"input-group-addon\" (click)=\"d1.toggle()\" type=\"button\">\r\n            <i class=\"fa fa-calendar\" style=\"width: 1.2rem; height: 1rem; cursor: pointer;\"> </i> \r\n          </button>\r\n          </div>\r\n        </div>\r\n        <div class=\"form-group\">\r\n            <label for=\"field1c\" class=\"form-control-label\">Kreator</label>\r\n              <input type=\"text\" [(ngModel)]=\"obavestenje.kreator.korisIme\" placeholder=\"kreator\" \r\n              class=\"form-control\" id=\"field7c\" name=\"field7\">\r\n          </div>\r\n          <div class=\"form-group\">\r\n              <label for=\"field1c\" class=\"form-control-label\">Zgrada</label>\r\n                <input type=\"text\" [(ngModel)]=\"obavestenje.zgrada.ime\" placeholder=\"zgrada\" \r\n                class=\"form-control\" id=\"field8c\" name=\"field8\">\r\n            </div>\r\n      \r\n    \r\n</form>\r\n<div>\r\n  <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n  <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n</div>"

/***/ }),

/***/ "../../../../../src/app/obavestenje-detail/obavestenje-detail.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ObavestenjeDetailComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common__ = __webpack_require__("../../../common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__obavestenja_obavestenja_service__ = __webpack_require__("../../../../../src/app/obavestenja/obavestenja.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__model_obavestenje_model__ = __webpack_require__("../../../../../src/app/model/obavestenje.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__model_korisnik_model__ = __webpack_require__("../../../../../src/app/model/korisnik.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__model_zgrada_model__ = __webpack_require__("../../../../../src/app/model/zgrada.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7_rxjs_add_operator_switchMap__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/switchMap.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__zgrade_zgrade_service__ = __webpack_require__("../../../../../src/app/zgrade/zgrade.service.ts");
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










var ObavestenjeDetailComponent = /** @class */ (function () {
    function ObavestenjeDetailComponent(obavestenjeService, zgradaService, korisnikService, route, location, router) {
        this.obavestenjeService = obavestenjeService;
        this.zgradaService = zgradaService;
        this.korisnikService = korisnikService;
        this.route = route;
        this.location = location;
        this.router = router;
        this.obavestenje = new __WEBPACK_IMPORTED_MODULE_4__model_obavestenje_model__["a" /* Obavestenje */]({
            datKreiranja: null,
            ime: '',
            opis: '',
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
            })
        });
        this.mode = 'ADD';
    }
    ObavestenjeDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        if (this.route.snapshot.params['id']) {
            this.mode = 'EDIT';
            // fetch course if we edit the existing course
            this.route.params
                .switchMap(function (params) {
                return _this.obavestenjeService.getObavestenje(+params['id']);
            })
                .subscribe(function (obavestenje) {
                _this.obavestenje = obavestenje;
            });
            this.route.queryParams.subscribe(function (params) {
                return _this.zgradaService.getZgrada(params['zgradaId'])
                    .then(function (zgrada) {
                    return _this.obavestenje.zgrada = zgrada;
                });
            });
        }
    };
    ObavestenjeDetailComponent.prototype.save = function () {
        this.mode == 'ADD' ? this.add() : this.edit();
    };
    ObavestenjeDetailComponent.prototype.add = function () {
        var _this = this;
        this.obavestenje.datKreiranja = new Date(this.ngbDatKreiranja.year, this.ngbDatKreiranja.month - 1, this.ngbDatKreiranja.day);
        this.obavestenjeService.addObavestenje(this.obavestenje)
            .then(function (obavestenje) {
            _this.obavestenjeService.announceChange();
            _this.goBack();
        });
    };
    ObavestenjeDetailComponent.prototype.edit = function () {
        var _this = this;
        this.obavestenjeService.editObavestenje(this.obavestenje)
            .then(function (obavestenje) {
            _this.obavestenjeService.announceChange();
            _this.goBack();
        });
    };
    ObavestenjeDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    ObavestenjeDetailComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-obavetsenje-detail',
            template: __webpack_require__("../../../../../src/app/obavestenje-detail/obavestenje-detail.component.html"),
            styles: [__webpack_require__("../../../../../src/app/obavestenje-detail/obavestenje-detail.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__obavestenja_obavestenja_service__["a" /* ObavestenjeService */], __WEBPACK_IMPORTED_MODULE_8__zgrade_zgrade_service__["a" /* ZgradaService */],
            __WEBPACK_IMPORTED_MODULE_9__korisnici_korisnik_service__["a" /* KorisnikService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], ObavestenjeDetailComponent);
    return ObavestenjeDetailComponent;
}());



/***/ }),

/***/ "../../../../../src/app/sednica-detail/sednica-detail.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/sednica-detail/sednica-detail.component.html":
/***/ (function(module, exports) {

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n<div>\r\n    <h3>Sednica</h3>\r\n</div>\r\n      \r\n <div>\r\n      \r\n    <form >\r\n        <div class=\"form-group\">\r\n            <label for=\"field1c\" class=\"form-control-label\">Id</label>\r\n            <input type=\"text\" [(ngModel)]=\"sednica.id\" placeholder=\"Id\" \r\n                class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n        </div> \r\n        <div class=\"form-group\">\r\n            <label for=\"field3c\" class=\"form-control-label\">Aktivna</label>\r\n            <input type=\"text\" [(ngModel)]=\"sednica.aktivna\" placeholder=\"Aktivna\" \r\n                class=\"form-control\" id=\"field4c\" name=\"field4\">\r\n        </div>\r\n    \r\n      \r\n        <div class=\"form-group\">\r\n            <div class=\"input-group\">\r\n                <label for=\"field1c\" class=\"form-control-label\">Datum kreiranja</label>\r\n                <input class=\"form-control\" placeholder=\"yyyy-mm-dd\" name=\"dp1\" [(ngModel)]=\"ngbDatKreiranja\" \r\n                    ngbDatepicker #d1=\"ngbDatepicker\">\r\n                <button class=\"input-group-addon\" (click)=\"d1.toggle()\" type=\"button\">\r\n                <i class=\"fa fa-calendar\" style=\"width: 1.2rem; height: 1rem; cursor: pointer;\"> </i> \r\n                </button>\r\n            </div>\r\n        </div>\r\n        <div class = \"form-group\">\r\n            <div class = \"input-group\">\r\n            <label for=\"field1c\" class=\"form-control-label\">Datum zakazivanja</label>\r\n            <input class=\"form-control\" placeholder=\"yyyy-mm-dd\" name=\"dp2\" [(ngModel)]=\"ngbDatZakazivanja\" \r\n              ngbDatepicker #d2=\"ngbDatepicker\">\r\n            <button class=\"input-group-addon\" (click)=\"d2.toggle()\" type=\"button\">\r\n            <i class=\"fa fa-calendar\" style=\"width: 1.2rem; height: 1rem; cursor: pointer;\"> </i> \r\n          </button>\r\n          </div>\r\n        </div>\r\n        <div class=\"form-group\">\r\n            <label for=\"field3c\" class=\"form-control-label\">Kreator</label>\r\n            <input type=\"text\" [(ngModel)]=\"sednica.kreator.korisIme\" placeholder=\"kreator\" \r\n                class=\"form-control\" id=\"field6c\" name=\"field6\">\r\n        </div>    \r\n       \r\n        <div class=\"form-group\">\r\n            <label for=\"field3c\" class=\"form-control-label\">Zgrada</label>\r\n            <input type=\"text\" [(ngModel)]=\"sednica.zgrada.id\" placeholder=\"zgrada\" \r\n                class=\"form-control\" id=\"field5c\" name=\"field5\">\r\n        </div>\r\n         \r\n    </form>\r\n    <div>\r\n        <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n        <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n      </div> \r\n</div>\r\n<div *ngIf=\"sednica.id\">\r\n    <div>\r\n      <h3>Zapisnici</h3>\r\n      <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAddZapisnik()\">\r\n        <span class=\"fa fa-plus\" aria-hidden=\"true\"></span>\r\n      </button>\r\n    </div>\r\n    <table class=\"table table-bordered\">\r\n      <tr *ngFor=\"let zapisnik of zapisnici\">\r\n        <td>\r\n        {{zapisnik.id}} {{zapisnik.datKreiranja}}{{zapisnik.opis}} {{zapisnik.kreator.ime}} {{zapisnik.zgrada.id}}\r\n        </td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary right\" aria-label=\"Delete\" (click)=\"deleteZapisnik(zapisnik.id)\">\r\n            <span class=\"fa fa-remove\" aria-hidden=\"true\"></span>\r\n          </button>\r\n        </td>\r\n      </tr>\r\n    </table>   \r\n  </div>\r\n  <table class=\"table table-bordered\">\r\n      <tr>\r\n        <th>Broj zapisnika</th>\r\n        <th>Datum kreiranja</th>\r\n        <th>Opis</th>\r\n        <th>Kreator</th>\r\n        <th>Zgrada</th>\r\n        <th>Sednica</th>\r\n  \r\n      </tr>\r\n      <tr *ngFor=\"let zapisnik of zapisnici\">\r\n        <td>{{zapisnik.id}}</td>\r\n        <td>{{sednica.datKreiranja}}</td>\r\n        <td>{{zapisnik.opis}}</td>\r\n        <td>{{zapisnik.kreator.korisIme}}</td>\r\n        <td>{{zapisnik.zgrada.id}}</td>\r\n        <td>{{zapisnik.sednica.id}}</td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEditZapisnik(zapisnik)\">\r\n            <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n          </button>  \r\n        </td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary right\" aria-label=\"Delete\" (click)=\"deleteZapisnik(zapisnik.id)\">\r\n            <span class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n          </button>\r\n        </td>\r\n      </tr>\r\n    </table>   "

/***/ }),

/***/ "../../../../../src/app/sednica-detail/sednica-detail.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SednicaDetailComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common__ = __webpack_require__("../../../common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__sednice_sednica_service__ = __webpack_require__("../../../../../src/app/sednice/sednica.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__model_sednica_model__ = __webpack_require__("../../../../../src/app/model/sednica.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_switchMap__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/switchMap.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__model_zgrada_model__ = __webpack_require__("../../../../../src/app/model/zgrada.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__model_korisnik_model__ = __webpack_require__("../../../../../src/app/model/korisnik.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__zgrade_zgrade_service__ = __webpack_require__("../../../../../src/app/zgrade/zgrade.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__zapisnici_zapisnici_service__ = __webpack_require__("../../../../../src/app/zapisnici/zapisnici.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};










var SednicaDetailComponent = /** @class */ (function () {
    function SednicaDetailComponent(zgradaService, sednicaService, zapisnikService, route, location, router) {
        var _this = this;
        this.zgradaService = zgradaService;
        this.sednicaService = sednicaService;
        this.zapisnikService = zapisnikService;
        this.route = route;
        this.location = location;
        this.router = router;
        this.mode = 'ADD';
        zapisnikService.RegenerateData$.subscribe(function () {
            return _this.getZapisnici();
        });
        this.sednica = new __WEBPACK_IMPORTED_MODULE_4__model_sednica_model__["a" /* Sednica */]({
            aktivna: null,
            datKreiranja: null,
            datZakazivanja: null,
            kreator: new __WEBPACK_IMPORTED_MODULE_7__model_korisnik_model__["a" /* Korisnik */]({
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
                vlasnik: new __WEBPACK_IMPORTED_MODULE_7__model_korisnik_model__["a" /* Korisnik */]({
                    ime: '',
                    lozinka: '',
                    korisIme: '',
                    uloga: '',
                })
            })
        });
    }
    SednicaDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        if (this.route.snapshot.params['id']) {
            this.mode = 'EDIT';
            // fetch student if we edit the existing student
            this.route.params
                .switchMap(function (params) {
                return _this.sednicaService.getSednica(+params['id']);
            }) // convert to number
                .subscribe(function (sednica) {
                _this.sednica = sednica;
                _this.getZapisnici();
            });
            this.route.queryParams.subscribe(function (params) {
                return _this.zgradaService.getZgrada(params['zgradaId'])
                    .then(function (zgrada) {
                    return _this.sednica.zgrada = zgrada;
                });
            });
        }
    };
    SednicaDetailComponent.prototype.getZapisnici = function () {
        var _this = this;
        this.sednicaService.getSednicaZapisnik(this.sednica.id).then(function (zapisnici) {
            return _this.zapisnici = zapisnici;
        });
    };
    SednicaDetailComponent.prototype.save = function () {
        this.mode == 'ADD' ? this.add() : this.edit();
    };
    SednicaDetailComponent.prototype.add = function () {
        var _this = this;
        this.sednica.datKreiranja = new Date(this.ngbDatKreiranja.year, this.ngbDatKreiranja.month - 1, this.ngbDatKreiranja.day);
        this.sednica.datZakazivanja = new Date(this.ngbDatZakazivanja.year, this.ngbDatZakazivanja.month - 1, this.ngbDatZakazivanja.day);
        this.sednicaService.addSednica(this.sednica)
            .then(function (sednica) {
            _this.sednicaService.announceChange();
            _this.goBack();
        });
    };
    SednicaDetailComponent.prototype.edit = function () {
        var _this = this;
        this.sednicaService.editSednica(this.sednica)
            .then(function (sednica) {
            _this.sednicaService.announceChange();
            _this.goBack();
        });
    };
    SednicaDetailComponent.prototype.gotoAddZapisnik = function () {
        this.router.navigate(['/addZapisnik'], { queryParams: { sednicaId: this.sednica.id } });
    };
    SednicaDetailComponent.prototype.gotoEditzapisnik = function (zapisnik) {
        this.router.navigate(['/editZapisnik', zapisnik.id], { queryParams: { sednicaId: this.sednica.id } });
    };
    SednicaDetailComponent.prototype.deleteZapisnik = function (zapisnikId) {
        var _this = this;
        this.zapisnikService.deleteZapisnik(zapisnikId).then(function () { return _this.getZapisnici(); });
    };
    SednicaDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    SednicaDetailComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-sednica-detail',
            template: __webpack_require__("../../../../../src/app/sednica-detail/sednica-detail.component.html"),
            styles: [__webpack_require__("../../../../../src/app/sednica-detail/sednica-detail.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_8__zgrade_zgrade_service__["a" /* ZgradaService */], __WEBPACK_IMPORTED_MODULE_3__sednice_sednica_service__["a" /* SednicaService */],
            __WEBPACK_IMPORTED_MODULE_9__zapisnici_zapisnici_service__["a" /* ZapisnikService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], SednicaDetailComponent);
    return SednicaDetailComponent;
}());



/***/ }),

/***/ "../../../../../src/app/sednice/sednica.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SednicaService; });
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




var SednicaService = /** @class */ (function () {
    function SednicaService(http) {
        this.http = http;
        this.sedniceUrl = 'api/sednica';
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        this.RegenerateData = new __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__["a" /* Subject */]();
        this.RegenerateData$ = this.RegenerateData.asObservable();
    }
    SednicaService.prototype.announceChange = function () {
        this.RegenerateData.next();
    };
    SednicaService.prototype.getSednice = function () {
        var url = 'api/sednica/all';
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    SednicaService.prototype.getSednica = function (id) {
        var url = this.sedniceUrl + "/" + id;
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    SednicaService.prototype.addSednica = function (sednica) {
        return this.http
            .post(this.sedniceUrl, JSON.stringify(sednica), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    SednicaService.prototype.editSednica = function (sednica) {
        return this.http
            .put(this.sedniceUrl, JSON.stringify(sednica), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    SednicaService.prototype.deleteSednica = function (sednicaId) {
        var url = this.sedniceUrl + "/" + sednicaId;
        return this.http
            .delete(url)
            .toPromise()
            .catch(this.handleError);
    };
    SednicaService.prototype.getSednicaZapisnik = function (sednicaId) {
        var url = this.sedniceUrl + "/" + sednicaId + "/zapisnik";
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    SednicaService.prototype.handleError = function (error) {
        console.error("Greska...", error);
        return Promise.reject(error.message || error);
    };
    SednicaService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]])
    ], SednicaService);
    return SednicaService;
}());



/***/ }),

/***/ "../../../../../src/app/sednice/sednice.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/sednice/sednice.component.html":
/***/ (function(module, exports) {

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Sednice</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Aktivna</th>\r\n      <th>Datum kreiranja</th>\r\n      <th>Datum zakazivanja</th>\r\n      <th>Kreator</th>\r\n      <th>Zgrada</th>\r\n      \r\n    </tr>\r\n    <tr *ngFor=\"let sednica of sednice\">\r\n      <td>\r\n        {{sednica.id}}\r\n      </td>\r\n      <td>\r\n        {{sednica.aktivna}}\r\n      </td>\r\n      <td>\r\n        {{sednica.datKreiranja | date: 'dd.MM.yyyy'}}\r\n      </td>\r\n      <td>\r\n        {{sednica.datZakazivanja | date: 'dd.MM.yyyy'}}\r\n      </td>\r\n      <td>\r\n        {{sednica.kreator.korisIme}}\r\n      </td>\r\n      <td>\r\n        {{sednica.zgrada.ime}}\r\n      </td>\r\n     \r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(sednica)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteSednica(sednica.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div> \r\n  "

/***/ }),

/***/ "../../../../../src/app/sednice/sednice.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SedniceComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__sednica_service__ = __webpack_require__("../../../../../src/app/sednice/sednica.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var SedniceComponent = /** @class */ (function () {
    function SedniceComponent(sednicaService, router) {
        var _this = this;
        this.sednicaService = sednicaService;
        this.router = router;
        this.subscription = sednicaService.RegenerateData$.subscribe(function () {
            return _this.getSednice();
        });
    }
    SedniceComponent.prototype.ngOnInit = function () {
        this.getSednice();
    };
    SedniceComponent.prototype.getSednice = function () {
        var _this = this;
        this.sednicaService.getSednice().then(function (sednice) {
            return _this.sednice = sednice;
        });
    };
    SedniceComponent.prototype.gotoAdd = function () {
        this.router.navigate(['/addSednica']);
    };
    SedniceComponent.prototype.gotoEdit = function (sednica) {
        this.router.navigate(['/editSednica', sednica.id]);
    };
    SedniceComponent.prototype.deleteSednica = function (sednicaId) {
        var _this = this;
        this.sednicaService.deleteSednica(sednicaId).then(function () { return _this.getSednice(); });
    };
    SedniceComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'sednica-list',
            template: __webpack_require__("../../../../../src/app/sednice/sednice.component.html"),
            styles: [__webpack_require__("../../../../../src/app/sednice/sednice.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__sednica_service__["a" /* SednicaService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], SedniceComponent);
    return SedniceComponent;
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

module.exports = "<div>\r\n    <h3>Stan</h3>\r\n  </div>\r\n  <div>\r\n  \r\n    <form >\r\n      <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Id</label>\r\n        <input type=\"text\" [(ngModel)]=\"stan.id\" placeholder=\"id\" \r\n          class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n      </div>\r\n      \r\n      <div class=\"form-group\">\r\n        <label for=\"field2c\" class=\"form-control-label\">Adresa</label>\r\n        <input type=\"text\" [(ngModel)]=\"stan.adresa\" placeholder=\"upisite adresu\" \r\n          class=\"form-control\" id=\"field2c\" name=\"field2\">\r\n      </div>\r\n      \r\n  \r\n         \r\n      <div class=\"form-group\">\r\n        <label for=\"field3c\" class=\"form-control-label\">Broj stanovnika</label>\r\n        <input type=\"text\" [(ngModel)]=\"stan.brStanovnika\" placeholder=\"stanovnici\" \r\n          class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n      </div>\r\n      \r\n      <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Ime</label>\r\n        <input type=\"text\" [(ngModel)]=\"stan.ime\" placeholder=\"upisite ime\" \r\n          class=\"form-control\" id=\"field4c\" name=\"field4\">\r\n      </div>\r\n\r\n      <div class=\"form-group\">\r\n        <label for=\"field4c\" class=\"form-control-label\">Vlasnik</label>\r\n        <input type=\"text\" [(ngModel)]=\"stan.vlasnik.korisIme\" placeholder=\"Vlasnik\" \r\n          class=\"form-control\" id=\"field5c\" name=\"field5\">\r\n      </div>\r\n      <div class=\"form-group\">\r\n        <label for=\"field5c\" class=\"form-control-label\">Zgrada</label>\r\n        <input type=\"text\" [(ngModel)]=\"stan.zgrada.id\" placeholder=\"zgrada\" \r\n          class=\"form-control\" id=\"field6c\" name=\"field6\">\r\n      </div>\r\n     </form>\r\n  <div>\r\n    <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n    <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n  </div> "

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
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__zgrade_zgrade_service__ = __webpack_require__("../../../../../src/app/zgrade/zgrade.service.ts");
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
    function StanDetailComponent(stanService, zgradaService, route, location) {
        this.stanService = stanService;
        this.zgradaService = zgradaService;
        this.route = route;
        this.location = location;
        this.stan = new __WEBPACK_IMPORTED_MODULE_4__model_stan_model__["a" /* Stan */]({
            adresa: '',
            brStanovnika: '',
            ime: '',
            vlasnik: new __WEBPACK_IMPORTED_MODULE_7__model_korisnik_model__["a" /* Korisnik */]({
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
                vlasnik: new __WEBPACK_IMPORTED_MODULE_7__model_korisnik_model__["a" /* Korisnik */]({
                    ime: '',
                    lozinka: '',
                    korisIme: '',
                    uloga: '',
                })
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
            this.route.queryParams.subscribe(function (params) {
                return _this.zgradaService.getZgrada(params['zgradaId'])
                    .then(function (zgrada) {
                    return _this.stan.zgrada = zgrada;
                });
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
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__stanovi_stan_service__["a" /* StanService */], __WEBPACK_IMPORTED_MODULE_8__zgrade_zgrade_service__["a" /* ZgradaService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */]])
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
        //const url = `${this.stanoviUrl}/all/${stan.id}`;
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

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Stanovi</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Adresa</th>\r\n      <th>Broj stanovnika</th>\r\n      <th>Ime</th>\r\n      <th>Vlasnik</th>\r\n      <th>Zgrada</th>\r\n    </tr>\r\n    <tr *ngFor=\"let stan of stanovi\">\r\n      <td>\r\n        {{stan.id}}\r\n      </td>\r\n      <td>\r\n        {{stan.adresa}}\r\n      </td>\r\n      <td>\r\n        {{stan.brStanovnika}}\r\n      </td>\r\n      <td>\r\n        {{stan.ime}}\r\n      </td>\r\n      <td>\r\n        {{stan.vlasnik.korisIme}}\r\n      </td>\r\n      <td>\r\n        {{stan.zgrada.ime}}\r\n      </td>\r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(stan)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteStan(stan.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div> \r\n  "

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

/***/ "../../../../../src/app/stavka-detail/stavka-detail.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/stavka-detail/stavka-detail.component.html":
/***/ (function(module, exports) {

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n<div>\r\n    <h3>Stavka</h3>\r\n</div>\r\n      \r\n <div>\r\n      \r\n    <form >\r\n        <div class=\"form-group\">\r\n            <label for=\"field1c\" class=\"form-control-label\">Id</label>\r\n            <input type=\"text\" [(ngModel)]=\"stavka.id\" placeholder=\"Id\" \r\n                class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n        </div>\r\n      \r\n        <div class=\"form-group\">\r\n            <div class=\"input-group\">\r\n                <label for=\"field2c\" class=\"form-control-label\">Datum kreiranja</label>\r\n                <input class=\"form-control\" placeholder=\"yyyy-mm-dd\" name=\"dp1\" [(ngModel)]=\"ngbdatKreiranja\" \r\n                    ngbDatepicker #d1=\"ngbDatepicker\">\r\n                <button class=\"input-group-addon\" (click)=\"d1.toggle()\" type=\"button\">\r\n                <i class=\"fa fa-calendar\" style=\"width: 1.2rem; height: 1rem; cursor: pointer;\"> </i> \r\n                </button>\r\n            </div>\r\n        </div>\r\n\r\n        <div class=\"form-group\">\r\n            <label for=\"field3c\" class=\"form-control-label\">Ime</label>\r\n            <input type=\"text\" [(ngModel)]=\"stavka.ime\" placeholder=\"Ime\" \r\n                class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n        </div>\r\n        <div class=\"form-group\">\r\n            <label for=\"field4c\" class=\"form-control-label\">Opis</label>\r\n            <input type=\"text\" [(ngModel)]=\"stavka.opis\" placeholder=\"Opis\" \r\n                class=\"form-control\" id=\"field4c\" name=\"field4\">\r\n        </div>\r\n        <div class=\"form-group\">\r\n                <label for=\"field5c\" class=\"form-control-label\">Kreator</label>\r\n                <input type=\"text\" [(ngModel)]=\"stavka.kreator.korisIme\" placeholder=\"kreator\" \r\n                    class=\"form-control\" id=\"field5c\" name=\"field5\">\r\n        </div>\r\n        <div class=\"form-group\">\r\n            <label for=\"field6c\" class=\"form-control-label\">Sednica</label>\r\n            <input type=\"text\" [(ngModel)]=\"stavka.sednica.id\" placeholder=\"Sednica\" \r\n                class=\"form-control\" id=\"field6c\" name=\"field6\">\r\n        </div>\r\n        \r\n    </form>\r\n    <div>\r\n        <button class=\"btn btn-primary\" (click)=\"goBack()\" >Cancel</button>\r\n        <button class=\"btn btn-primary\" (click)=\"save()\" >OK</button>\r\n      </div> \r\n</div>"

/***/ }),

/***/ "../../../../../src/app/stavka-detail/stavka-detail.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StavkaDetailComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common__ = __webpack_require__("../../../common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__stavke_stavke_service__ = __webpack_require__("../../../../../src/app/stavke/stavke.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__model_stavka_model__ = __webpack_require__("../../../../../src/app/model/stavka.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_switchMap__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/switchMap.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__model_korisnik_model__ = __webpack_require__("../../../../../src/app/model/korisnik.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__korisnici_korisnik_service__ = __webpack_require__("../../../../../src/app/korisnici/korisnik.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__model_sednica_model__ = __webpack_require__("../../../../../src/app/model/sednica.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__sednice_sednica_service__ = __webpack_require__("../../../../../src/app/sednice/sednica.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__model_zgrada_model__ = __webpack_require__("../../../../../src/app/model/zgrada.model.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};











var StavkaDetailComponent = /** @class */ (function () {
    function StavkaDetailComponent(stavkaService, korisnikService, sednicaService, route, location) {
        this.stavkaService = stavkaService;
        this.korisnikService = korisnikService;
        this.sednicaService = sednicaService;
        this.route = route;
        this.location = location;
        this.stavka = new __WEBPACK_IMPORTED_MODULE_4__model_stavka_model__["a" /* Stavka */]({
            datKreiranja: null,
            ime: '',
            opis: '',
            kreator: new __WEBPACK_IMPORTED_MODULE_6__model_korisnik_model__["a" /* Korisnik */]({
                ime: '',
                lozinka: '',
                korisIme: '',
                uloga: '',
            }),
            sednica: new __WEBPACK_IMPORTED_MODULE_8__model_sednica_model__["a" /* Sednica */]({
                datKreiranja: null,
                datZakazivanja: null,
                aktivna: false,
                zgrada: new __WEBPACK_IMPORTED_MODULE_10__model_zgrada_model__["a" /* Zgrada */]({
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
                }),
                kreator: new __WEBPACK_IMPORTED_MODULE_6__model_korisnik_model__["a" /* Korisnik */]({
                    ime: '',
                    lozinka: '',
                    korisIme: '',
                    uloga: '',
                })
            })
        });
        this.mode = 'ADD';
    }
    StavkaDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        if (this.route.snapshot.params['id']) {
            this.mode = 'EDIT';
            // fetch student if we edit the existing student
            this.route.params
                .switchMap(function (params) {
                return _this.stavkaService.getStavka(+params['id']);
            }) // convert to number
                .subscribe(function (stavka) {
                _this.stavka = stavka;
            });
            this.route.queryParams.subscribe(function (params) {
                return _this.sednicaService.getSednica(params['sednicaId'])
                    .then(function (sednica) {
                    return _this.stavka.sednica = sednica;
                });
            });
        }
    };
    StavkaDetailComponent.prototype.save = function () {
        this.mode == 'ADD' ? this.add() : this.edit();
    };
    StavkaDetailComponent.prototype.add = function () {
        var _this = this;
        this.stavkaService.addStavka(this.stavka)
            .then(function (stavka) {
            _this.stavkaService.announceChange();
            _this.goBack();
        });
    };
    StavkaDetailComponent.prototype.edit = function () {
        var _this = this;
        this.stavkaService.editStavka(this.stavka)
            .then(function (stavka) {
            _this.stavkaService.announceChange();
            _this.goBack();
        });
    };
    StavkaDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    StavkaDetailComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-stavka-detail',
            template: __webpack_require__("../../../../../src/app/stavka-detail/stavka-detail.component.html"),
            styles: [__webpack_require__("../../../../../src/app/stavka-detail/stavka-detail.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__stavke_stavke_service__["a" /* StavkaService */], __WEBPACK_IMPORTED_MODULE_7__korisnici_korisnik_service__["a" /* KorisnikService */],
            __WEBPACK_IMPORTED_MODULE_9__sednice_sednica_service__["a" /* SednicaService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */]])
    ], StavkaDetailComponent);
    return StavkaDetailComponent;
}());



/***/ }),

/***/ "../../../../../src/app/stavke/stavke.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/stavke/stavke.component.html":
/***/ (function(module, exports) {

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Stavke</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Datum kreiranja</th>\r\n      <th>Ime</th>\r\n      <th>Opis</th>\r\n      <th>Kreator</th>\r\n      <th>Sednica</th>\r\n    </tr>\r\n    <tr *ngFor=\"let stavka of stavke\">\r\n      <td>\r\n        {{stavka.id}}\r\n      </td>\r\n      <td>\r\n        {{stavka.datKreiranja}}\r\n      </td>\r\n      <td>\r\n        {{stavka.ime}}\r\n      </td>\r\n      <td>\r\n        {{stavka.opis}}\r\n      </td>\r\n      <td>\r\n        {{stavka.kreator.korisIme}}\r\n      </td>\r\n      <td>\r\n        {{stavka.sednica.id}}\r\n      </td>\r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(stavka)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteStavka(stavka.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div> \r\n  "

/***/ }),

/***/ "../../../../../src/app/stavke/stavke.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StavkeComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__stavke_service__ = __webpack_require__("../../../../../src/app/stavke/stavke.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__sednice_sednica_service__ = __webpack_require__("../../../../../src/app/sednice/sednica.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var StavkeComponent = /** @class */ (function () {
    function StavkeComponent(stavkaService, sednicaService, router) {
        var _this = this;
        this.stavkaService = stavkaService;
        this.sednicaService = sednicaService;
        this.router = router;
        this.subscription = stavkaService.RegenerateData$.subscribe(function () {
            return _this.getStavke();
        });
    }
    StavkeComponent.prototype.ngOnInit = function () {
        this.getStavke();
    };
    StavkeComponent.prototype.getStavke = function () {
        var _this = this;
        this.stavkaService.getStavke().then(function (stavke) {
            return _this.stavka = stavke;
        });
    };
    StavkeComponent.prototype.gotoAdd = function () {
        this.router.navigate(['/addStavka']);
    };
    StavkeComponent.prototype.gotoEdit = function (stavka) {
        this.router.navigate(['/editStavka', stavka.id]);
    };
    StavkeComponent.prototype.deleteStavka = function (stavkeId) {
        var _this = this;
        this.stavkaService.deleteStavka(stavkeId).then(function () { return _this.getStavke(); });
    };
    StavkeComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'stavke-list',
            template: __webpack_require__("../../../../../src/app/stavke/stavke.component.html"),
            styles: [__webpack_require__("../../../../../src/app/stavke/stavke.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__stavke_service__["a" /* StavkaService */], __WEBPACK_IMPORTED_MODULE_3__sednice_sednica_service__["a" /* SednicaService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], StavkeComponent);
    return StavkeComponent;
}());



/***/ }),

/***/ "../../../../../src/app/stavke/stavke.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StavkaService; });
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




var StavkaService = /** @class */ (function () {
    function StavkaService(http) {
        this.http = http;
        this.stavkeUrl = 'api/stavka';
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        this.RegenerateData = new __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__["a" /* Subject */]();
        this.RegenerateData$ = this.RegenerateData.asObservable();
    }
    StavkaService.prototype.announceChange = function () {
        this.RegenerateData.next();
    };
    StavkaService.prototype.getStavke = function () {
        var url = 'api/stavka/all';
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    StavkaService.prototype.getStavka = function (id) {
        var url = this.stavkeUrl + "/" + id;
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    StavkaService.prototype.addStavka = function (stavka) {
        return this.http
            .post(this.stavkeUrl, JSON.stringify(stavka), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    StavkaService.prototype.editStavka = function (stavka) {
        return this.http
            .put(this.stavkeUrl, JSON.stringify(stavka), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    StavkaService.prototype.getStavkaSednica = function (stavkaId) {
        var url = this.stavkeUrl + "/" + stavkaId + "/sednica";
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    StavkaService.prototype.deleteStavka = function (stavkaId) {
        var url = this.stavkeUrl + "/" + stavkaId;
        return this.http
            .delete(url)
            .toPromise()
            .catch(this.handleError);
    };
    StavkaService.prototype.handleError = function (error) {
        console.error("Greska...", error);
        return Promise.reject(error.message || error);
    };
    StavkaService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]])
    ], StavkaService);
    return StavkaService;
}());



/***/ }),

/***/ "../../../../../src/app/zapisnici/zapisnici.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/zapisnici/zapisnici.component.html":
/***/ (function(module, exports) {

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Zapisnici</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Datum kreiranja</th>\r\n      <th>Opis</th>\r\n      <th>Kreator</th>\r\n      <th>Zgrada</th>\r\n      <th>Sednica</th>\r\n      \r\n    </tr>\r\n    <tr *ngFor=\"let zapisnik of zapisnik\">\r\n      <td>{{zapisnik.id}}</td>\r\n      <td>{{zapisnik.DatKreiranja}}</td>\r\n      <td>{{zapisnik.opis}}</td>\r\n      <td>{{zapisnik.kreator.korisIme}}</td>\r\n      <td>{{zapisnik.zgrada.id}}</td>\r\n      <td>{{zapisnik.sednica.id}}</td>      \r\n\r\n      \r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(zapisnik)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteZapisnik(zapisnik.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div>"

/***/ }),

/***/ "../../../../../src/app/zapisnici/zapisnici.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ZapisniciComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__zapisnici_service__ = __webpack_require__("../../../../../src/app/zapisnici/zapisnici.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__sednice_sednica_service__ = __webpack_require__("../../../../../src/app/sednice/sednica.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var ZapisniciComponent = /** @class */ (function () {
    function ZapisniciComponent(zapisnikService, sednicaService, router) {
        var _this = this;
        this.zapisnikService = zapisnikService;
        this.sednicaService = sednicaService;
        this.router = router;
        this.subscription = zapisnikService.RegenerateData$.subscribe(function () {
            return _this.getZapisnici();
        });
    }
    ZapisniciComponent.prototype.ngOnInit = function () {
        this.getZapisnici();
    };
    ZapisniciComponent.prototype.getZapisnici = function () {
        var _this = this;
        this.zapisnikService.getZapisnici().then(function (zapisnici) {
            return _this.zapisnik = zapisnici;
        });
    };
    /*getKvar(id: number): void {
      this.kvarService.getKvar(id).then(
        this.komentarService.getKomentar()
      )
    }*/
    ZapisniciComponent.prototype.gotoAdd = function () {
        this.router.navigate(['/addZapisnik']);
    };
    ZapisniciComponent.prototype.gotoEdit = function (zapisnik) {
        this.router.navigate(['/editZapisnik', zapisnik.id]);
    };
    ZapisniciComponent.prototype.deleteZapisnik = function (zapisniciId) {
        var _this = this;
        this.zapisnikService.deleteZapisnik(zapisniciId).then(function () { return _this.getZapisnici(); });
    };
    ZapisniciComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'zapisnici-list',
            template: __webpack_require__("../../../../../src/app/zapisnici/zapisnici.component.html"),
            styles: [__webpack_require__("../../../../../src/app/zapisnici/zapisnici.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__zapisnici_service__["a" /* ZapisnikService */], __WEBPACK_IMPORTED_MODULE_3__sednice_sednica_service__["a" /* SednicaService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], ZapisniciComponent);
    return ZapisniciComponent;
}());



/***/ }),

/***/ "../../../../../src/app/zapisnici/zapisnici.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ZapisnikService; });
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




var ZapisnikService = /** @class */ (function () {
    function ZapisnikService(http) {
        this.http = http;
        this.zapisniciUrl = 'api/zapisnik';
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        this.RegenerateData = new __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__["a" /* Subject */]();
        this.RegenerateData$ = this.RegenerateData.asObservable();
    }
    ZapisnikService.prototype.announceChange = function () {
        this.RegenerateData.next();
    };
    ZapisnikService.prototype.getZapisnici = function () {
        return this.http.get("api/zapisnik/all")
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    ZapisnikService.prototype.getZapisnik = function (id) {
        var url = this.zapisniciUrl + "/" + id;
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    ZapisnikService.prototype.addZapisnik = function (zapisnik) {
        return this.http
            .post(this.zapisniciUrl, JSON.stringify(zapisnik), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    ZapisnikService.prototype.editZapisnik = function (zapisnik) {
        return this.http
            .put(this.zapisniciUrl, JSON.stringify(zapisnik), { headers: this.headers })
            .toPromise()
            .then(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    ZapisnikService.prototype.deleteZapisnik = function (zapisnikId) {
        var url = this.zapisniciUrl + "/" + zapisnikId;
        return this.http
            .delete(url)
            .toPromise()
            .catch(this.handleError);
    };
    ZapisnikService.prototype.getZapisnikSednica = function (zapisnikId) {
        var url = this.zapisniciUrl + "/" + zapisnikId + "/sednica";
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    ZapisnikService.prototype.handleError = function (error) {
        console.error("Error... ", error);
        return Promise.reject(error.message || error);
    };
    ZapisnikService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]])
    ], ZapisnikService);
    return ZapisnikService;
}());



/***/ }),

/***/ "../../../../../src/app/zapisnik-detail/zapisnik-detail.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/zapisnik-detail/zapisnik-detail.component.html":
/***/ (function(module, exports) {

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n  <h3>Zapisnik</h3>\r\n</div>\r\n\r\n<div>\r\n  <form>\r\n    <div class=\"form-group\">\r\n      <label for=\"field1c\" class=\"form-control-label\">Id</label>\r\n        <input type=\"text\" [(ngModel)]=\"zapisnik.id\" placeholder=id \r\n        class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n    </div>\r\n  \r\n    <div class=\"form-group\">\r\n        <div class=\"input-group\">\r\n            <label for=\"field1c\" class=\"form-control-label\">Datum kreiranja</label>\r\n            <input class=\"form-control\" placeholder=\"yyyy-mm-dd\" name=\"dp1\" [(ngModel)]=\"ngbDatKreiranja\" \r\n              ngbDatepicker #d1=\"ngbDatepicker\">\r\n            <button class=\"input-group-addon\" (click)=\"d1.toggle()\" type=\"button\">\r\n            <i class=\"fa fa-calendar\" style=\"width: 1.2rem; height: 1rem; cursor: pointer;\"> </i> \r\n            </button>\r\n        </div>\r\n    </div>\r\n    <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Opis</label>\r\n        <input type=\"text\" [(ngModel)]=\"zapisnik.opis\" placeholder=\"Opis\" \r\n            class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n    </div>\r\n    \r\n    <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Kreator</label>\r\n        <input type=\"text\" [(ngModel)]=\"zapisnik.kreator.korisIme\" placeholder=\"kreator\" \r\n            class=\"form-control\" id=\"field7c\" name=\"field7\">\r\n    </div>\r\n    <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Zgrada</label>\r\n        <input type=\"text\" [(ngModel)]=\"zapisnik.zgrada.id\" placeholder=\"zgrada\" \r\n            class=\"form-control\" id=\"field8c\" name=\"field8\">\r\n    </div>\r\n    <div class=\"form-group\">\r\n        <label for=\"field1c\" class=\"form-control-label\">Sednica</label>\r\n        <input type=\"text\" [(ngModel)]=\"zapisnik.sednica.id\" placeholder=\"sednica\" \r\n            class=\"form-control\" id=\"field8c\" name=\"field8\">\r\n    </div>\r\n<div>\r\n  <button class=\"btn btn-primary\" (click)=\"save()\">OK</button>\r\n  <button class=\"btn btn-primary\" (click)=\"goBack()\">Cancel</button>\r\n</div>"

/***/ }),

/***/ "../../../../../src/app/zapisnik-detail/zapisnik-detail.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ZapisnikDetailComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common__ = __webpack_require__("../../../common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__zapisnici_zapisnici_service__ = __webpack_require__("../../../../../src/app/zapisnici/zapisnici.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__model_korisnik_model__ = __webpack_require__("../../../../../src/app/model/korisnik.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__model_sednica_model__ = __webpack_require__("../../../../../src/app/model/sednica.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__model_zgrada_model__ = __webpack_require__("../../../../../src/app/model/zgrada.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7_rxjs_add_operator_switchMap__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/switchMap.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__sednice_sednica_service__ = __webpack_require__("../../../../../src/app/sednice/sednica.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__korisnici_korisnik_service__ = __webpack_require__("../../../../../src/app/korisnici/korisnik.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__model_zapisnik_model__ = __webpack_require__("../../../../../src/app/model/zapisnik.model.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};











var ZapisnikDetailComponent = /** @class */ (function () {
    function ZapisnikDetailComponent(zapisnikService, sednicaService, korisnikService, route, location, router) {
        this.zapisnikService = zapisnikService;
        this.sednicaService = sednicaService;
        this.korisnikService = korisnikService;
        this.route = route;
        this.location = location;
        this.router = router;
        this.zapisnik = new __WEBPACK_IMPORTED_MODULE_10__model_zapisnik_model__["a" /* Zapisnik */]({
            datKreiranja: null,
            opis: '',
            kreator: new __WEBPACK_IMPORTED_MODULE_4__model_korisnik_model__["a" /* Korisnik */]({
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
                vlasnik: new __WEBPACK_IMPORTED_MODULE_4__model_korisnik_model__["a" /* Korisnik */]({
                    ime: '',
                    lozinka: '',
                    korisIme: '',
                    uloga: '',
                })
            }),
            sednica: new __WEBPACK_IMPORTED_MODULE_5__model_sednica_model__["a" /* Sednica */]({
                aktivna: false,
                datKreiranja: null,
                datZakazivanja: null,
                kreator: new __WEBPACK_IMPORTED_MODULE_4__model_korisnik_model__["a" /* Korisnik */]({
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
                    vlasnik: new __WEBPACK_IMPORTED_MODULE_4__model_korisnik_model__["a" /* Korisnik */]({
                        ime: '',
                        lozinka: '',
                        korisIme: '',
                        uloga: '',
                    })
                })
            })
        });
        this.mode = 'ADD';
        /*komentarService.RegenerateData$.subscribe(() =>
          this.getEnrollments()
        );*/
    }
    ZapisnikDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        if (this.route.snapshot.params['id']) {
            this.mode = 'EDIT';
            // fetch course if we edit the existing course
            this.route.params
                .switchMap(function (params) {
                return _this.zapisnikService.getZapisnik(+params['id']);
            })
                .subscribe(function (zapisnik) {
                _this.zapisnik = zapisnik;
            });
            this.route.queryParams.subscribe(function (params) {
                return _this.sednicaService.getSednica(params['sednicaId'])
                    .then(function (sednica) {
                    return _this.zapisnik.sednica = sednica;
                });
            });
        }
    };
    ZapisnikDetailComponent.prototype.save = function () {
        this.mode == 'ADD' ? this.add() : this.edit();
    };
    ZapisnikDetailComponent.prototype.add = function () {
        var _this = this;
        this.zapisnikService.addZapisnik(this.zapisnik)
            .then(function (zapisnik) {
            _this.zapisnikService.announceChange();
            _this.goBack();
        });
    };
    ZapisnikDetailComponent.prototype.edit = function () {
        var _this = this;
        this.zapisnikService.editZapisnik(this.zapisnik)
            .then(function (zapisnik) {
            _this.zapisnikService.announceChange();
            _this.goBack();
        });
    };
    ZapisnikDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    ZapisnikDetailComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-zapisnik-detail',
            template: __webpack_require__("../../../../../src/app/zapisnik-detail/zapisnik-detail.component.html"),
            styles: [__webpack_require__("../../../../../src/app/zapisnik-detail/zapisnik-detail.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__zapisnici_zapisnici_service__["a" /* ZapisnikService */], __WEBPACK_IMPORTED_MODULE_8__sednice_sednica_service__["a" /* SednicaService */],
            __WEBPACK_IMPORTED_MODULE_9__korisnici_korisnik_service__["a" /* KorisnikService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], ZapisnikDetailComponent);
    return ZapisnikDetailComponent;
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

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n  <h3>Zgrada {{zgrada.ime}}</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n</head>\r\n\r\n<div>\r\n  <form>\r\n    <div class=\"form-group\">\r\n      <label for=\"field1c\" class=\"form-control-label\">Id</label>\r\n      <input type=\"text\" [(ngModel)]=\"zgrada.id\" placeholder=id \r\n        class=\"form-control\" id=\"field1c\" name=\"field1\">\r\n    </div>\r\n    <div class=\"form-group\">\r\n      <label for=\"field2c\" class=\"form-control-label\">Ime</label>\r\n      <input type=\"text\" [(ngModel)]=\"zgrada.ime\" placeholder=\"Name\" \r\n        class=\"form-control\" id=\"field2c\" name=\"field2\">\r\n    </div>\r\n    <div class=\"form-group\">\r\n      <label for=\"field3c\" class=\"form-control-label\">Adresa</label>\r\n      <input type=\"text\" [(ngModel)]=\"zgrada.adresa\" placeholder=\"Opis\" \r\n        class=\"form-control\" id=\"field3c\" name=\"field3\">\r\n    </div>\r\n    <div class=\"form-group\">\r\n      <label for=\"field4c\" class=\"form-control-label\">Broj stanova</label>\r\n      <input type=\"text\" [(ngModel)]=\"zgrada.brStanova\" placeholder=\"broj stanova\" \r\n        class=\"form-control\" id=\"field4c\" name=\"field4\">\r\n    </div>\r\n    <div class=\"form-group\">\r\n      <label for=\"field5c\" class=\"form-control-label\">Broj naseljenih</label>\r\n      <input type=\"text\" [(ngModel)]=\"zgrada.brNaseljenih\" placeholder=\"broj naseljenih\" \r\n        class=\"form-control\" id=\"field5c\" name=\"field5\">\r\n    </div>\r\n    <div class=\"form-group\">\r\n      <label for=\"field6c\" class=\"form-control-label\">Vlasnik</label>\r\n      <input type=\"text\" [(ngModel)]=\"zgrada.vlasnik.korisIme\" placeholder=\"vlasnik\" \r\n        class=\"form-control\" id=\"field6c\" name=\"field6\">\r\n    </div>\r\n  </form>\r\n  <div *ngIf=\"zgrada.id\">\r\n    <div>\r\n      <h3>Kvarovi</h3>\r\n      <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAddKvar()\">\r\n        <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n      </button>\r\n    </div>\r\n    <table class=\"table table-bordered\">\r\n      <tr>\r\n        <th>Broj kvara</th>\r\n        <th>Ime</th>\r\n        <th>Datum kreiranja</th>\r\n        <th>Datum zakazivanja</th>\r\n        <th>Datum popravke</th>\r\n        <th>Kreator</th>\r\n      </tr>\r\n      <tr *ngFor=\"let kvar of kvarovi\">\r\n        <td>{{kvar.id}}</td>\r\n        <td>{{kvar.ime}}</td>\r\n        <td>{{kvar.opis}}</td>\r\n        <td>{{kvar.datKreiranja | date: 'dd.MM.yyyy'}}</td>\r\n        <td>{{kvar.datZakazivanja | date: 'dd.MM.yyyy'}}</td>\r\n        <td>{{kvar.datPopravke | date: 'dd.MM.yyyy'}}</td>\r\n        <td>{{kvar.kreator.korisIme}}</td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEditKvar(kvar)\">\r\n            <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n          </button>  \r\n        </td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary right\" aria-label=\"Delete\" (click)=\"deleteKvar(kvar.id)\">\r\n            <span class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n          </button>\r\n        </td>\r\n      </tr>\r\n    </table>   \r\n  </div>\r\n  <div *ngIf=\"zgrada.id\">\r\n    <div>\r\n      <h3>Stanovi</h3>\r\n      <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAddStan()\">\r\n        <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n      </button>\r\n    </div>\r\n    <table class=\"table table-bordered\">\r\n      <tr>\r\n        <th>Broj stana</th>\r\n        <th>Ime</th>\r\n        <th>Adresa</th>\r\n        <th>Broj stanovnika</th>\r\n        <th>Vlasnik</th>\r\n      </tr>\r\n      <tr *ngFor=\"let stan of stanovi\">\r\n        <td>{{stan.id}}</td>\r\n        <td>{{stan.ime}}</td>\r\n        <td>{{stan.adresa}}</td>\r\n        <td>{{stan.brStanovnika}}</td>\r\n        <td>{{stan.vlasnik.korisIme}}</td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEditStan(stan)\">\r\n            <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n          </button>  \r\n        </td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary right\" aria-label=\"Delete\" (click)=\"deleteStan(stan.id)\">\r\n            <span class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n          </button>\r\n        </td>\r\n      </tr>\r\n    </table>   \r\n  </div>\r\n  <div *ngIf=\"zgrada.id\">\r\n    <div>\r\n      <h3>Obavestenja</h3>\r\n      <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAddObavestenje()\">\r\n        <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n      </button>\r\n    </div>\r\n    <table class=\"table table-bordered\">\r\n      <tr>\r\n        <th>Broj obavestenja</th>\r\n        <th>Ime</th>\r\n        <th>Opis</th>\r\n        <th>Datum kreiranja</th>\r\n        <th>Kreator</th>\r\n      </tr>\r\n      <tr *ngFor=\"let obavestenje of obavestenja\">\r\n        <td>{{obavestenje.id}}</td>\r\n        <td>{{obavestenje.ime}}</td>\r\n        <td>{{obavestenje.opis}}</td>\r\n        <td>{{obavestenje.datKreiranja | date: 'dd.MM.yyyy'}}</td>\r\n        <td>{{obavestenje.kreator.korisIme}}</td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEditObavestenje(obavestenje)\">\r\n            <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n          </button>  \r\n        </td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary right\" aria-label=\"Delete\" (click)=\"deleteObavestenje(obavestenje.id)\">\r\n            <span class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n          </button>\r\n        </td>\r\n      </tr>\r\n    </table>   \r\n  </div>\r\n  <div *ngIf=\"zgrada.id\">\r\n    <div>\r\n      <h3>Sednice</h3>\r\n      <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAddSednica()\">\r\n        <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n      </button>\r\n    </div>\r\n    <table class=\"table table-bordered\">\r\n      <tr>\r\n        <th>Broj sednice</th>\r\n        <th>Aktivna</th>\r\n        <th>Datum kreiranja</th>\r\n        <th>Datum zakazivanja</th>\r\n        <th>Kreator</th>\r\n      </tr>\r\n      <tr *ngFor=\"let sednica of sednice\">\r\n        <td>{{sednica.id}}</td>\r\n        <td>{{sednica.aktivna}}</td>\r\n        <td>{{sednica.datKreiranja | date: 'dd.MM.yyyy'}}</td>\r\n        <td>{{sednica.datZakazivanja | date: 'dd.MM.yyyy'}}</td>\r\n        <td>{{sednica.kreator.korisIme}}</td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEditSednica(sednica)\">\r\n            <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n          </button>  \r\n        </td>\r\n        <td>\r\n          <button type=\"button\" class=\"btn btn-primary right\" aria-label=\"Delete\" (click)=\"deleteSednica(sednica.id)\">\r\n            <span class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n          </button>\r\n        </td>\r\n      </tr>\r\n    </table>   \r\n  </div>\r\n\r\n</div>\r\n<div>\r\n  <button class=\"btn btn-primary\" (click)=\"save()\" style=\"font-size:18px;color:darkgreen\">OK</button>\r\n  <button class=\"btn btn-primary\" (click)=\"goBack()\" style=\"font-size:18px;color:darkgreen\">Cancel</button>\r\n</div>"

/***/ }),

/***/ "../../../../../src/app/zgrada-detail/zgrada-detail.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ZgradaDetailComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common__ = __webpack_require__("../../../common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__zgrade_zgrade_service__ = __webpack_require__("../../../../../src/app/zgrade/zgrade.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__model_korisnik_model__ = __webpack_require__("../../../../../src/app/model/korisnik.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__model_zgrada_model__ = __webpack_require__("../../../../../src/app/model/zgrada.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_rxjs_add_operator_switchMap__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/switchMap.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__kvarovi_kvarovi_service__ = __webpack_require__("../../../../../src/app/kvarovi/kvarovi.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__korisnici_korisnik_service__ = __webpack_require__("../../../../../src/app/korisnici/korisnik.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__stanovi_stan_service__ = __webpack_require__("../../../../../src/app/stanovi/stan.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__obavestenja_obavestenja_service__ = __webpack_require__("../../../../../src/app/obavestenja/obavestenja.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__sednice_sednica_service__ = __webpack_require__("../../../../../src/app/sednice/sednica.service.ts");
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
    function ZgradaDetailComponent(kvarService, zgradaService, sednicaService, korisnikService, stanService, obavestenjeService, route, location, router) {
        var _this = this;
        this.kvarService = kvarService;
        this.zgradaService = zgradaService;
        this.sednicaService = sednicaService;
        this.korisnikService = korisnikService;
        this.stanService = stanService;
        this.obavestenjeService = obavestenjeService;
        this.route = route;
        this.location = location;
        this.router = router;
        kvarService.RegenerateData$.subscribe(function () {
            return _this.getKvarovi();
        });
        sednicaService.RegenerateData$.subscribe(function () {
            return _this.getSednice();
        });
        stanService.RegenerateData$.subscribe(function () {
            return _this.getStanovi();
        });
        obavestenjeService.RegenerateData$.subscribe(function () {
            return _this.getObavestenja();
        });
        this.zgrada = new __WEBPACK_IMPORTED_MODULE_5__model_zgrada_model__["a" /* Zgrada */]({
            adresa: '',
            brNaseljenih: null,
            brStanova: null,
            ime: '',
            vlasnik: new __WEBPACK_IMPORTED_MODULE_4__model_korisnik_model__["a" /* Korisnik */]({
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
            // fetch course if we edit the existing course
            this.route.params
                .switchMap(function (params) {
                return _this.zgradaService.getZgrada(+params['id']);
            })
                .subscribe(function (zgrada) {
                _this.zgrada = zgrada;
                _this.getKvarovi();
                _this.getStanovi();
                _this.getObavestenja();
                _this.getSednice();
            });
        }
    };
    ZgradaDetailComponent.prototype.getKvarovi = function () {
        var _this = this;
        this.zgradaService.getZgradaKvar(this.zgrada.id).then(function (kvarovi) {
            return _this.kvarovi = kvarovi;
        });
    };
    ZgradaDetailComponent.prototype.getSednice = function () {
        var _this = this;
        this.zgradaService.getZgradaSednica(this.zgrada.id).then(function (sednice) {
            return _this.sednice = sednice;
        });
    };
    ZgradaDetailComponent.prototype.getStanovi = function () {
        var _this = this;
        this.zgradaService.getZgradaStan(this.zgrada.id).then(function (stanovi) {
            return _this.stanovi = stanovi;
        });
    };
    ZgradaDetailComponent.prototype.getObavestenja = function () {
        var _this = this;
        this.zgradaService.getZgradaObavestenje(this.zgrada.id).then(function (obavestenja) {
            return _this.obavestenja = obavestenja;
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
            _this.goBack();
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
    ZgradaDetailComponent.prototype.gotoEditKvar = function (kvar) {
        this.router.navigate(['/editKvar', kvar.id], { queryParams: { zgradaId: this.zgrada.id } });
    };
    ZgradaDetailComponent.prototype.deleteKvar = function (kvarId) {
        var _this = this;
        this.kvarService.deleteKvar(kvarId).then(function () { return _this.getKvarovi(); });
    };
    ZgradaDetailComponent.prototype.gotoAddSednica = function () {
        this.router.navigate(['/addSednica'], { queryParams: { zgradaId: this.zgrada.id } });
    };
    ZgradaDetailComponent.prototype.gotoEditSednica = function (sednica) {
        this.router.navigate(['/editSednica', sednica.id], { queryParams: { zgradaId: this.zgrada.id } });
    };
    ZgradaDetailComponent.prototype.deleteSednica = function (sednicaId) {
        var _this = this;
        this.sednicaService.deleteSednica(sednicaId).then(function () { return _this.getSednice(); });
    };
    ZgradaDetailComponent.prototype.gotoAddStan = function () {
        this.router.navigate(['/addStan'], { queryParams: { zgradaId: this.zgrada.id } });
    };
    ZgradaDetailComponent.prototype.gotoEditStan = function (stan) {
        this.router.navigate(['/editStan', stan.id], { queryParams: { zgradaId: this.zgrada.id } });
    };
    ZgradaDetailComponent.prototype.deleteStan = function (stanId) {
        var _this = this;
        this.stanService.deleteStan(stanId).then(function () { return _this.getStanovi(); });
    };
    ZgradaDetailComponent.prototype.gotoAddObavestenje = function () {
        this.router.navigate(['/addObavestenje'], { queryParams: { zgradaId: this.zgrada.id } });
    };
    ZgradaDetailComponent.prototype.gotoEditObavestenje = function (obavestenje) {
        this.router.navigate(['/editObavestenje', obavestenje.id], { queryParams: { zgradaId: this.zgrada.id } });
    };
    ZgradaDetailComponent.prototype.deleteObavestenje = function (obavestenjeId) {
        var _this = this;
        this.obavestenjeService.deleteObavestenje(obavestenjeId).then(function () { return _this.getObavestenja(); });
    };
    ZgradaDetailComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-zgrada-detail',
            template: __webpack_require__("../../../../../src/app/zgrada-detail/zgrada-detail.component.html"),
            styles: [__webpack_require__("../../../../../src/app/zgrada-detail/zgrada-detail.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_7__kvarovi_kvarovi_service__["a" /* KvarService */], __WEBPACK_IMPORTED_MODULE_3__zgrade_zgrade_service__["a" /* ZgradaService */], __WEBPACK_IMPORTED_MODULE_11__sednice_sednica_service__["a" /* SednicaService */],
            __WEBPACK_IMPORTED_MODULE_8__korisnici_korisnik_service__["a" /* KorisnikService */], __WEBPACK_IMPORTED_MODULE_9__stanovi_stan_service__["a" /* StanService */], __WEBPACK_IMPORTED_MODULE_10__obavestenja_obavestenja_service__["a" /* ObavestenjeService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */], __WEBPACK_IMPORTED_MODULE_2__angular_common__["f" /* Location */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], ZgradaDetailComponent);
    return ZgradaDetailComponent;
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

module.exports = "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n\r\n<div>\r\n   <h3>Zgrade</h3>\r\n</div>\r\n<head>\r\n  <style>\r\n  table, th, td {\r\n    border-right: 2px solid rgb(208, 236, 197);\r\n  }\r\n  </style>\r\n  </head>\r\n  <table>\r\n    <tr>\r\n      <th>Id</th>\r\n      <th>Ime</th>\r\n      <th>Adresa</th>\r\n      <th>Broj stanova</th>\r\n      <th>Broj naseljenih</th>\r\n      <th>Vlasnik</th>\r\n      \r\n    </tr>\r\n    <tr *ngFor=\"let zgrada of zgrade\">\r\n      <td>{{zgrada.id}}</td>\r\n      <td>{{zgrada.ime}}</td>\r\n      <td>{{zgrada.adresa}}</td>\r\n      <td>{{zgrada.brStanova}}</td>\r\n      <td>{{zgrada.brNaseljenih}}</td>\r\n      <td>{{zgrada.vlasnik.korisIme}}</td>\r\n      \r\n      <td>\r\n        <button type=\"button\" class=\"btn btn-primary\"  aria-label=\"Edit\" (click)=\"gotoEdit(zgrada)\">\r\n          <span class=\"fa fa-edit\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n        </button>\r\n  \r\n        <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Delete\" (click)=\"deleteZgrada(zgrada.id)\">\r\n          <i class=\"fa fa-remove\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></i>\r\n        </button>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  <div class=\"right\">\r\n    <button type=\"button\" class=\"btn btn-primary\" aria-label=\"Add\" (click)=\"gotoAdd()\">\r\n      <span class=\"fa fa-plus\" aria-hidden=\"true\" style=\"font-size:18px;color:darkgreen\"></span>\r\n    </button>\r\n  </div>"

/***/ }),

/***/ "../../../../../src/app/zgrade/zgrade.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ZgradeComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__zgrade_service__ = __webpack_require__("../../../../../src/app/zgrade/zgrade.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__kvarovi_kvarovi_service__ = __webpack_require__("../../../../../src/app/kvarovi/kvarovi.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__stanovi_stan_service__ = __webpack_require__("../../../../../src/app/stanovi/stan.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__obavestenja_obavestenja_service__ = __webpack_require__("../../../../../src/app/obavestenja/obavestenja.service.ts");
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
    function ZgradeComponent(zgradaService, kvarService, StanService, obavestenjeService, router) {
        var _this = this;
        this.zgradaService = zgradaService;
        this.kvarService = kvarService;
        this.StanService = StanService;
        this.obavestenjeService = obavestenjeService;
        this.router = router;
        this.subscription = kvarService.RegenerateData$.subscribe(function () {
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
    ZgradeComponent.prototype.deleteKvar = function (zgradeId) {
        var _this = this;
        this.zgradaService.deleteZgrada(zgradeId).then(function () { return _this.getZgrade(); });
    };
    ZgradeComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'zgrade-list',
            template: __webpack_require__("../../../../../src/app/zgrade/zgrade.component.html"),
            styles: [__webpack_require__("../../../../../src/app/zgrade/zgrade.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__zgrade_service__["a" /* ZgradaService */], __WEBPACK_IMPORTED_MODULE_3__kvarovi_kvarovi_service__["a" /* KvarService */],
            __WEBPACK_IMPORTED_MODULE_4__stanovi_stan_service__["a" /* StanService */], __WEBPACK_IMPORTED_MODULE_5__obavestenja_obavestenja_service__["a" /* ObavestenjeService */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]])
    ], ZgradeComponent);
    return ZgradeComponent;
}());



/***/ }),

/***/ "../../../../../src/app/zgrade/zgrade.service.ts":
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
        return this.http.get("api/zgrada/all")
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
    ZgradaService.prototype.getZgradaKvar = function (zgradaId) {
        var url = this.zgradeUrl + "/" + zgradaId + "/kvar";
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    ZgradaService.prototype.getZgradaSednica = function (zgradaId) {
        var url = this.zgradeUrl + "/" + zgradaId + "/sednica";
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    ZgradaService.prototype.getZgradaStan = function (zgradaId) {
        var url = this.zgradeUrl + "/" + zgradaId + "/stan";
        return this.http.get(url)
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    ZgradaService.prototype.getZgradaObavestenje = function (zgradaId) {
        var url = this.zgradeUrl + "/" + zgradaId + "/obavestenje";
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