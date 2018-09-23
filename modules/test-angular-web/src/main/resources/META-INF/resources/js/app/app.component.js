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
            this.orders = '';
        }
        AppComponent.prototype.ngOnInit = function () {
            var _this = this;
            this.http.get("http://jsonplaceholder.typicode.com/users").
                map(function (response) { return response.json(); }).
                subscribe(function (data) {
                //console.log(data);
                _this.results = data;
            });
            this.http.get("http://localhost:2020/o/order-rest-api/ordersummary/getOrders").
                map(function (response) { return response.json(); }).
                subscribe(function (data) {
                console.log(data.list);
                _this.orders = data.list;
            });
        };
        AppComponent = __decorate([
            core_1.Component({
                template: "\n\t\t<div class=\"container\">\n\t\t\t<h3>{{caption}}</h3>\n\t\t\t<h1>{{title}}</h1>\n\t\t    <h2>{{hero.name}} details!</h2>\n\t\t    <div><label>id: </label>{{hero.id}}</div>\n\t\t    <div>\n\t\t      <label>name: </label>\n\t\t      {{hero.name}}\n\t\t    </div>\n\t\t    \n\t\t    <hr>\n\t\t    <div class=\"records\">\n\t\t    \t<ul *ngFor = \"let result of results\">\n\t\t\t\t   <li>Name : {{result.name}} Address: {{result.address.city}}</li>\n\t\t\t\t</ul>\n\t\t    </div>\n\t\t    \n\t\t    <hr>\n\t\t    <div class=\"orders\">\n\t\t    \t<ul *ngFor = \"let order of orders\">\n\t\t\t\t   <li>Name : {{order.serializable.accountName}} Address: {{order.serializable.createdBy}}</li>\n\t\t\t\t</ul>\n\t\t    </div>\n\t\t    \n\t\t    <table *ngIf=\"orders\" style=\"width:100%\" border=1>\n\t\t        <!-- ADD HEADERS -->\n\t\t        <thead>\n\t\t        <tr>\n\t\t            <th>Order Number</th>\n\t\t            <th>Order Status</th>\n\t\t            <th>Account Name</th>\n\t\t            <th>Order StartDate</th>\n\t\t            <th>CreatedBy</th>\n\t\t            <th>Location</th>\n\t\t        </tr>\n\t\t      </thead>\n\t\t\n\t\t        <!-- BIND ARRAY TO TABLE -->\n\t\t          <tbody>\n\t\t        <tr *ngFor=\"let order of orders\">\n\t\t            <td>{{order.serializable.orderNumber}}</td>\n\t\t            <td>{{order.serializable.orderStatus}}</td>\n\t\t            <td>{{order.serializable.accountName}}</td>\n\t\t            <td>{{order.serializable.orderStartDate.time | date: 'yyyy-MM-dd' }}</td>\n\t\t            <td>{{order.serializable.createdBy}}</td>\n\t\t            <td>{{order.serializable.location}}</td>\n\t\t        </tr>\n\t\t      </tbody>\n\t\t    </table>\n\t    </div>\n\t"
            }),
            __metadata("design:paramtypes", [http_1.Http])
        ], AppComponent);
        return AppComponent;
    }());
    exports.AppComponent = AppComponent;
});
//# sourceMappingURL=app.component.js.map