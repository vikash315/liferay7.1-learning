import React from 'react';
import ReactDOM from 'react-dom';
import axios from 'axios';

class Square extends React.Component {
	render() {
		return (
			<button className="square" onClick={() => this.props.onClick()}>
				{this.props.value}
			</button>
		);
	}
}

class Board extends React.Component {
	constructor() {
		super();
		this.state = {
			squares: Array(9).fill(null),
			xIsNext: true,
		};
	}

	handleClick(i) {
		const squares = this.state.squares.slice();
		if (calculateWinner(squares) || squares[i]) {
			return;
		}
		squares[i] = this.state.xIsNext ? 'X' : 'O';
		this.setState({ squares: squares, xIsNext: !this.state.xIsNext });
	}

	renderSquare(i) {
		return (
			<Square
				value={this.state.squares[i]}
				onClick={() => this.handleClick(i)}
			/>
		);
	}

	render() {
		const winner = calculateWinner(this.state.squares);
		let status;
		if (winner) {
			status = 'Winner: ' + winner;
		} else {
			status = 'Next player: ' + (this.state.xIsNext ? 'X' : 'O');
		}

		return (
			<div>
				<div className="status">{status}</div>
				<div className="board-row">
					{this.renderSquare(0)}
					{this.renderSquare(1)}
					{this.renderSquare(2)}
				</div>
				<div className="board-row">
					{this.renderSquare(3)}
					{this.renderSquare(4)}
					{this.renderSquare(5)}
				</div>
				<div className="board-row">
					{this.renderSquare(6)}
					{this.renderSquare(7)}
					{this.renderSquare(8)}
				</div>
			</div>
		);
	}
}

class Game extends React.Component {
	constructor () {
	    super()
	    this.state = {
	      username: '',
	      location: '',
	      results: []
	    }
	    this.handleClick = this.handleClick.bind(this)
	}
	
	handleClick () {
	    console.log('Success!')
	    axios.get('https://api.github.com/users/maecapozzi')
	    .then(response => this.setState({
	      username: response.data.name,
	      location: response.data.location
	    }))
	}
	
	componentDidMount() { 
		axios.get('https://jsonplaceholder.typicode.com/users')
	    .then(response => this.setState({
	      results: response.data
	    }));
		
		axios.get('https://api.github.com/users/maecapozzi')
	    .then(response => console.log(response));
	}
	    
	render() {
		return (
			<div className="game">
				<div className='button__container'>
		          <button className='button' onClick={this.handleClick}>Click Me</button>
		        </div>
		        <p>{this.state.username}</p>
		        <p>{this.state.location}</p>
		        <hr />
		        <ul>
		          {this.state.results.map(result =>
		            <li key={result.id}>{result.name}</li>
		          )}
		        </ul>
		        <hr />
		        
				<div className="game-board">
					<Board />
				</div>
				<div className="game-info">
					<div>{/* status */}</div>
					<ol>{/* TODO */}</ol>
				</div>
			</div>
		);
	}
}

function calculateWinner(squares) {
	const lines = [
		[0, 1, 2],
		[3, 4, 5],
		[6, 7, 8],
		[0, 3, 6],
		[1, 4, 7],
		[2, 5, 8],
		[0, 4, 8],
		[2, 4, 6],
	];
	for (let i = 0; i < lines.length; i++) {
		const [a, b, c] = lines[i];
		if (
			squares[a] &&
			squares[a] === squares[b] &&
			squares[a] === squares[c]
		) {
			return squares[a];
		}
	}
	return null;
}

export default function(elementId) {
	ReactDOM.render(<Game />, document.getElementById(elementId));
}