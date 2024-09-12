class RecintosZoo {

    constructor() {
        //INSERIR OS DADOS DOS RECINTOS E ANIMAS

        this.bioma = new Map();
        this.bioma.set('SAVANA', { Recinto: 1, TAM: 10, 'ANIMAIS EXISTENTES': ['MACACO', 'MACACO', 'MACACO'] });
        this.bioma.set('FLORESTA', { Recinto: 2, TAM: 5, 'ANIMAIS EXISTENTES': [] });
        this.bioma.set('SAVANAERIO', { Recinto: 3, TAM: 7, 'ANIMAIS EXISTENTES': ['GAZELA'] });
        this.bioma.set('RIO', { Recinto: 4, TAM: 8, 'ANIMAIS EXISTENTES': [] });
        this.bioma.set('SAVANA_2', { Recinto: 5, TAM: 9, 'ANIMAIS EXISTENTES': ['LEÃO'] });

        //PARA DEFINIR OS BIOMAS DE CADA ANIMAL,UTILIZEI  A ESPECIFICAÇÃO QUE FOI DADA NO ENUNCIADO PARA TODAS SITUAÇÕES POSSIVEIS POIS SÃO POUCOS ANIMAIS E BIOMAS
        //ASSIM DESDE INICIO JÁ DEFINIR OS BIOMAS DE CADA ANIMAL

        this.animais = new Map();
        this.animais.set('MACACO', { 'nome': 'MACACO', 'tamanho': 1, 'bioma': [this.bioma.get('SAVANA'), this.bioma.get('FLORESTA'), this.bioma.get('SAVANAERIO')] });
        this.animais.set('LEÃO', { 'nome': 'LEÃO', 'tamanho': 3, 'bioma': [this.bioma.get('SAVANA_2')] });
        this.animais.set('LEOPARDO', { 'nome ': 'LEOPARDO', 'tamanho': 2, 'bioma': [this.bioma.get('SAVANA')] });
        this.animais.set('CROCODILO', { 'nome': 'CROCODILO', 'tamanho': 3, 'bioma': [this.bioma.get('RIO')] });
        this.animais.set('GAZELA', { 'nome': 'GAZELA', 'tamanho': 2, 'bioma': [this.bioma.get('SAVANA'), this.bioma.get('SAVANAERIO')] });
        this.animais.set('HIPOPOTAMO', { 'nome': 'HIPOPOTAMO', 'tamanho': 4, 'bioma': [this.bioma.get('SAVANAERIO')] });
    }

    analisaRecintos(animal, quantidade) {
        if (!this.animais.has(animal)) {
            console.log("Animal inválido");
            return { erro: "Animal inválido" };
        }
        if (quantidade <= 0) {
            console.log("Quantidade inválida");
            return { erro: "Quantidade inválida" };
        }
        //ANIMALRELACIONADO E O ANINAL QUE FOI PASSADI COMO PARAMETRO,COM BASE NO QUE FOI INSERIDO 
        let animalrelacionado = this.animais.get(animal);
        let recintosViaveis = [];
        switch (animalrelacionado.nome) {
            case 'MACACO':
                if (quantidade * animalrelacionado.tamanho >= animalrelacionado.bioma[0].TAM) {
                    return { erro: "Não há recinto viável" };
                }
                if (quantidade * animalrelacionado.tamanho >= animalrelacionado.bioma[1].TAM) {
                    return { erro: "Não há recinto viável" };
                }
                if (quantidade * animalrelacionado.tamanho >= animalrelacionado.bioma[2].TAM) {

                    return { erro: "Não há recinto viável" };
                }
                // FOREACH COM AS CONDIÇÕES DO ANIMAL PARA ESTAR NO BIOMA ADQUADO
                animalrelacionado.bioma.forEach((item) => {
                    let espaço = (item.TAM - item['ANIMAIS EXISTENTES'].length) - quantidade * animalrelacionado.tamanho;
                    let kll = item['ANIMAIS EXISTENTES'];
                    kll.push(animalrelacionado.nome);
                    if (Array.isArray(kll)) {
                        let nusmp = new Set(kll)
                        let nusmp2 = nusmp.size;
                        if (nusmp2 > 1) {
                            (espaço = (espaço - nusmp2));
                        }
                    }
                    if (espaço <= 0) {
                        return ('Não há recinto viável');
                    }

                    recintosViaveis.push(`Recinto ${item.Recinto} (espaço livre: ${espaço} total: ${item.TAM})`);

                });

                return { recintosViaveis };

                break;

            case 'LEÃO':
                if (quantidade * animalrelacionado.tamanho >= animalrelacionado.bioma[0].TAM) {
                    return { erro: "Não há recinto viável" };
                }
                // FOREACH COM AS CONDIÇÕES DO ANIMAL PARA ESTAR NO BIOMA ADQUADO
                animalrelacionado.bioma.forEach(function (item) {
                    let espaço = (item.TAM - item['ANIMAIS EXISTENTES'].length) - quantidade * animalrelacionado.tamanho;
                    if (espaço <= 0) {
                        console.log('Não há recinto viável');
                    }
                    recintosViaveis.push(`Recinto ${item.Recinto} (espaço livre: ${espaço} total: ${item.TAM})`);
                });
                return { recintosViaveis };

                break;
            case 'LEOPARDO':
                return { erro: "Não tem bioma adequado no momento para o animal" }
                break;

            case 'CROCODILO':
                if (quantidade * animalrelacionado.tamanho >= animalrelacionado.bioma[0].TAM) {
                    return { erro: "Não há recinto viável" };
                }
                // FOREACH COM AS CONDIÇÕES DO ANIMAL PARA ESTAR NO BIOMA ADQUADO              
                animalrelacionado.bioma.forEach(function (item) {
                    let espaço = (item.TAM - item['ANIMAIS EXISTENTES'].length) - quantidade * animalrelacionado.tamanho;
                    if (espaço <= 0) {
                        return ('Não há recinto viável');
                    }
                    recintosViaveis.push(`Recinto ${item.Recinto} (espaço livre: ${espaço} total: ${item.TAM})`);
                });
                return { recintosViaveis };

                break;

            case 'GAZELA':
                if (quantidade * animalrelacionado.tamanho >= animalrelacionado.bioma[0].TAM) {
                    return { erro: "Não há recinto viável" };
                }
                if (quantidade * animalrelacionado.tamanho >= animalrelacionado.bioma[1].TAM) {
                    return { erro: "Não há recinto viável" };
                }
                // FOREACH COM AS CONDIÇÕES DO ANIMAL PARA ESTAR NO BIOMA ADQUADO
                animalrelacionado.bioma.forEach(function (item) {
                    let espaço = (item.TAM - item['ANIMAIS EXISTENTES'].length) - quantidade * animalrelacionado.tamanho;
                    let mskl = item['ANIMAIS EXISTENTES'];
                    kll.push(animalrelacionado.nome);
                    if (Array.isArray(mskl)) {
                        let nusmp = new Set(mskl)
                        let nusmp2 = nusmp.size;
                        if (nusmp2 > 1) {
                            (espaço = (espaço - nusmp2));
                        }
                    }
                    if (espaço <= 0) {
                        console.log('Não há recinto viável');
                    }
                    recintosViaveis.push(`Recinto ${item.Recinto} (espaço livre: ${espaço} total: ${item.TAM})`);
                });
                return { recintosViaveis };
                break;
            case 'HIPOPOTAMO':
                if (quantidade * animalrelacionado.tamanho >= animalrelacionado.bioma[0].TAM) {
                    return { erro: "Não há recinto viável" };
                }
                if (quantidade * animalrelacionado.tamanho >= animalrelacionado.bioma[1].TAM) {
                    return { erro: "Não há recinto viável" };
                }
                // FOREACH COM AS CONDIÇÕES DO ANIMAL PARA ESTAR NO BIOMA ADQUADO
                animalrelacionado.bioma.forEach(function (item) {
                    let espaço = (item.TAM - item['ANIMAIS EXISTENTES'].length) - quantidade * animalrelacionado.tamanho;
                    let hpt = item['ANIMAIS EXISTENTES'];
                    kll.push(animalrelacionado.nome);
                    if (Array.isArray(hpt)) {
                        let nusmp = new Set(hpt)
                        let nusmp2 = nusmp.size;
                        if (nusmp2 > 1) {
                            (espaço = (espaço - nusmp2));
                        }
                    }
                    if (espaço <= 0) {
                        return ('Não há recinto viável');
                    }
                    recintosViaveis.push(`Recinto ${item.Recinto} (espaço livre: ${espaço} total: ${item.TAM})`);
                });
                return { recintosViaveis };

                break;
            default:
                console.log('Animal não encontrado)');
                break;
        }
    }

}
let zoo = new RecintosZoo();
console.log(zoo.analisaRecintos('CROCODILO', 2));
export { RecintosZoo as RecintosZoo };

