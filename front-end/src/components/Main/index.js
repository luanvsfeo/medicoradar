import React from 'react';
import './styles.css'


export default class Main extends React.Component {

    render() {
        return (
            <div>

               

                { <iframe className="map" src={this.props.source}></iframe> }

            </div>
        );
    }
}