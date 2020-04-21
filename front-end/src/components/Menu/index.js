import React from 'react';
import './styles.css'
// import Main from '../Main/index'

export default class Menu extends React.Component {

    state = {

        convenio: ['Unimed', 'Porto Seguro', '1', '2', '3', '4', '5', '6', '7'],
        plano: ['Vazio'],
        atendimento: ['Vazio']

    }

    setPlano = (convenio) => {

        // alert(convenio)

        
        if(convenio === "Unimed"){
            
            this.setState({ plano:['Básico', 'Médio', 'Avançado', 'Expert', 'Ultra'] })
            
        }
        
        if(convenio === "Porto Seguro"){
            
            this.setState({ plano:['Soft', 'Ultrasoft', 'Hard', 'Ultrahard', 'Exceptional'] })
            
        }
        
    }

    setAtendimento = (plano) => {

        // alert(plano)

        if(plano === "Básico"){

            this.setState({ atendimento:[

                {
                    nome:"Nome1",
                    valor: "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d470400.4150229554!2d-43.72687010222971!3d-22.913251252234634!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9bde559108a05b%3A0x50dc426c672fd24e!2sRio%20de%20Janeiro%2C%20RJ!5e0!3m2!1spt-BR!2sbr!4v1587312247161!5m2!1spt-BR!2sbr"
                },
                {
                    nome:"Nome2",
                    valor: "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3675.3677173421734!2d-43.18309914999044!3d-22.89980404330426!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x997f5c5251ae01%3A0xe1a687e309a2bf9d!2sMOOVE%20-%20PLANOS%20DE%20SAUDE%20RJ%20RIO%20AMIL%20DIX%20ASSIM%20UNIMED%20SALUTAR%20GOLDEN%20CROSS%20MEMORIAL!5e0!3m2!1spt-BR!2sbr!4v1587441183338!5m2!1spt-BR!2sbr"
                },
                {
                    nome:"Nome3",
                    valor: "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2598.884185272055!2d-43.180614898317906!3d-22.89945180084397!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x997f5bd7ae52b9%3A0xfdf0c3e1f79dc150!2sCenter%20Hotel!5e0!3m2!1spt-BR!2sbr!4v1587441251116!5m2!1spt-BR!2sbr"
                },
                {
                    nome:"Nome4",
                    valor: "Valor4"
                }
    
            ] })

        }

        if(plano === "Médio"){

            this.setState({ atendimento:[

                {
                    nome:"Nome1",
                    valor: "Valor1"
                },
                {
                    nome:"Nome2",
                    valor: "Valor2"
                },
                {
                    nome:"Nome3",
                    valor: "Valor3"
                },
                {
                    nome:"Nome4",
                    valor: "Valor4"
                }
    
            ] })

        }

    }

    render() {
        return (
            <div className="menu">

                <h1>Menu</h1>

                <form action="" name="search-form" id="search-form">

                    <div className="form">

                        <div className="combo-container">

                            <h3>Convênio</h3>

                            <select id="convenio-list" placeholder="Selecione um convênio" onChange={() => this.setPlano(document.getElementById('convenio-list').value)}>

                                {this.state.convenio.map(item => (

                                    <option key={item} value={item}>{item}</option>

                                ))}

                            </select>

                        </div>

                        <div className="combo-container">

                            <h3>Plano</h3>

                            <select id="plano-list" placeholder="Selecione um convênio" onChange={() => this.setAtendimento(document.getElementById('plano-list').value)}>

                                {this.state.plano.map(item => (

                                    <option key={item}  value={item}>{item}</option>

                                ))}

                            </select>

                        </div>

                        <div className="combo-container">

                            <h3>Atendimento</h3>

                            <select id="atendimento-list" placeholder="Selecione um convênio" onChange={ () => { this.props.handleSubmit(document.getElementById('atendimento-list').value) } }>

                                {this.state.atendimento.map(item => (

                                    <option key={item.valor}  value={item.valor}>{item.nome}</option>

                                ))}

                            </select>

                        </div>

                    </div>


                </form>


            </div>
        );
    }
}
