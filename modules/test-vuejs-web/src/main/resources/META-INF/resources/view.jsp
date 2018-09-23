<%@ include file="./init.jsp" %>

<div id="<portlet:namespace />-1">
	<p>A friendly reversible message from Vue.js:</p>
	<p>{{text}}</p>
	<p>{{message}}</p>
	<button v-on:click="reverseMessage">Reverse message, pretty please</button>
</div>

<hr />

<div id="<portlet:namespace />-2">
	<p>A to do list made with Vue.js components:</p>
	<ol>
		<todo-item
			v-bind:key="item.id"
			v-bind:todo="item"
			v-for="item in groceryList"
		/>
	</ol>
</div>

<hr />

<div id="<portlet:namespace />-3">
	<h1>{{ msg }}</h1>
    <ul v-if="posts && posts.length">
	    <li v-for="post of posts">
	      <p><strong>{{post.name}}</strong></p>
	      <p>{{post.address.zipcode}}</p>
	    </li>
	  </ul>
	
	  <ul v-if="errors && errors.length">
	    <li v-for="error of errors">
	      {{error.message}}
	    </li>
	  </ul>
</div>


<aui:script require="<%= bootstrapRequire %>">
	bootstrapRequire.default('<portlet:namespace />');
</aui:script>