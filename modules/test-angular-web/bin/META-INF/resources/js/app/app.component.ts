import { Component } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

export class Hero {
	id: number;
	name: string;
}



@Component({
	template: `
		<div class="container">
			<h3>{{caption}}</h3>
			<h1>{{title}}</h1>
		    <h2>{{hero.name}} details!</h2>
		    <div><label>id: </label>{{hero.id}}</div>
		    <div>
		      <label>name: </label>
		      {{hero.name}}
		    </div>
		    
		    <hr>
		    <div class="records">
		    	<ul *ngFor = "let result of results">
				   <li>Name : {{result.name}} Address: {{result.address.city}}</li>
				</ul>
		    </div>
		    
		    <hr>
		    <div class="orders">
		    	<ul *ngFor = "let order of orders">
				   <li>Name : {{order.serializable.accountName}} Address: {{order.serializable.createdBy}}</li>
				</ul>
		    </div>
		    
		    <table *ngIf="orders" style="width:100%" border=1>
		        <!-- ADD HEADERS -->
		        <thead>
		        <tr>
		            <th>Order Number</th>
		            <th>Order Status</th>
		            <th>Account Name</th>
		            <th>Order StartDate</th>
		            <th>CreatedBy</th>
		            <th>Location</th>
		        </tr>
		      </thead>
		
		        <!-- BIND ARRAY TO TABLE -->
		          <tbody>
		        <tr *ngFor="let order of orders">
		            <td>{{order.serializable.orderNumber}}</td>
		            <td>{{order.serializable.orderStatus}}</td>
		            <td>{{order.serializable.accountName}}</td>
		            <td>{{order.serializable.orderStartDate.time | date: 'yyyy-MM-dd' }}</td>
		            <td>{{order.serializable.createdBy}}</td>
		            <td>{{order.serializable.location}}</td>
		        </tr>
		      </tbody>
		    </table>
	    </div>
	`
})
export class AppComponent {
	caption = 'Hello world!';
	title = 'Tour of Heroes';
	hero: Hero = {
		id: 1,
		name: 'Windstorm',
	};
	results = '';
	orders = '';
	
	constructor(private http: Http) { }
	   ngOnInit() {
	      this.http.get("http://jsonplaceholder.typicode.com/users").
	      map((response) => response.json()).
	      subscribe((data) => {
	      	//console.log(data);
	      	this.results = data as string;
	      });
	      
	      this.http.get("http://localhost:2020/o/order-rest-api/ordersummary/getOrders").
	      map((response) => response.json()).
	      subscribe((data) => {
	      	console.log(data.list);
	      	this.orders = data.list as string;
	      });
	      
	      
	   }
}