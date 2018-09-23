var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
define(["require", "exports", "@angular/core", "@angular/http", "rxjs/add/operator/map"], function (require, exports, core_1, http_1) {
    "use strict";
    Object.defineProperty(exports, "__esModule", { value: true });
    var Hero = /** @class */ (function () {
        function Hero() {
        }
        return Hero;
    }());
    exports.Hero = Hero;
    var AppComponent = /** @class */ (function () {
        function AppComponent(http) {
            this.http = http;
            this.caption = 'Hello world!';
            this.title = 'Tour of Heroes';
            this.hero = {
                id: 1,
                name: 'Windstorm',
            };
            this.results = '';
        }
        AppComponent.prototype.ngOnInit = function () {
            var _this = this;
            this.http.get("http://jsonplaceholder.typicode.com/users").
                map(function (response) { return response.json(); }).
                subscribe(function (data) {
                console.log(data);
                _this.results = data;
            });
        };
        AppComponent = __decorate([
            core_1.Component({
                template: "\n\t\t<div class=\"container\">\n\t\t\t<h3>{{caption}}</h3>\n\t\t\t<h1>{{title}}</h1>\n\t\t    <h2>{{hero.name}} details!</h2>\n\t\t    <div><label>id: </label>{{hero.id}}</div>\n\t\t    <div>\n\t\t      <label>name: </label>\n\t\t      {{hero.name}}\n\t\t    </div>\n\t\t    \n\t\t    <hr>\n\t\t    <div class=\"records\">\n\t\t    \t<ul *ngFor = \"let result of results\">\n\t\t\t\t   <li>Name : {{result.name}} Address: {{result.address.city}}</li>\n\t\t\t\t</ul>\n\t\t    </div>\n\t    </div>\n\t"
            }),
            __metadata("design:paramtypes", [http_1.Http])
        ], AppComponent);
        return AppComponent;
    }());
    exports.AppComponent = AppComponent;
});
//# sourceMappingURL=app.component.js.map