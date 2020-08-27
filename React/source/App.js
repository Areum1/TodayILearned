import React, {Component} from 'react';
import Subject from "./components/Subject"
import Content from "./components/Content"
import Nav from "./components/Nav"
import './App.css';



class App extends Component {
  constructor(props){
    super(props);
    this.state = {
      mode:'welcome',
      subject: {title:'WEB', sub:'World Wide Web!!'},
      welcome:{title:'Welcome', desc:'Hello, React!!'},
      contents: [
        {id:1, title:'HTML',desc:'HTML is for information'},
        {id:2, title:'CSS',desc:'CSS is for design'},
        {id:3, title:'JavaScript',desc:'JavaScript is for interactive'}
      ]
    }
  }
  render() {
    var _title, _desc = null;
    if(this.state.mode === 'welcome'){
      _title = this.state.welcome.title;
      _desc = this.state.welcome.desc;
    } else if(this.state.mode === 'read'){
      _title = this.state.contents[0].title;
      _desc = this.state.contents[0].desc;
    }

    return (
      <div className="App">
        <Subject 
          title={this.state.subject.title} 
          sub={this.state.subject.sub}
          onChangePage={function(){
              alert('hihihi');
            }.bind(this)}
        >
        </Subject>
        {/* <header>
            <h1><a href="/" onClick={function(e){
              console.log(e);
              e.preventDefault();
              this.setState({
                mode:'welcome'
              });
            }.bind(this)}>{this.state.subject.title}</a></h1>
            {this.state.subject.sub}
        </header> */}

        <Nav data={this.state.contents}></Nav>
        <Content title={_title} desc={_desc}></Content>
      </div>
    );
  }
}

export default App;
