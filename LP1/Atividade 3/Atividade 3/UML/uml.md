# Diagramas UML - Item 2a

Cada imagem virou **uma única classe**, que reúne os 3 atributos e 3 métodos de cada uma das 3 classes originais
(9 atributos e 9 métodos, além do construtor, getters e setters).
Quando o mesmo nome aparecia em mais de uma das classes originais, foi acrescentado um sufixo
(ex.: `cor` virou `corTerno` / `corManequim`; `descrever()` virou `descreverTerno()` / `descreverManequim()`).

## Imagem 1 - Loja de roupas

### LojaDeRoupas

```
LojaDeRoupas
------------------------------------------------------------
# Loja
- nome : String
- cidade : String
- funcionarios : int
# Terno
- corTerno : String
- tamanho : String
- preco : double
# Manequim
- alturaCm : double
- corManequim : String
- roupa : String
------------------------------------------------------------
# Loja
+ anunciarInauguracao() : String
+ contratar(quantidade : int) : String
+ calcularFolha(salarioMedio : double) : double
# Terno
+ aplicarDesconto(percentual : double) : double
+ calcularParcela(parcelas : int) : double
+ descreverTerno() : String
# Manequim
+ vestir(novaRoupa : String) : String
+ despir() : String
+ descreverManequim() : String
```

## Imagem 2 - Ciclismo na trilha

### CiclismoNaTrilha

```
CiclismoNaTrilha
------------------------------------------------------------
# Ciclista
- nomeCiclista : String
- idade : int
- velocidadeMedia : double
# Bicicleta
- marca : String
- numeroMarchas : int
- marchaAtual : int
# Trilha
- nomeTrilha : String
- comprimentoKm : double
- dificuldade : String
------------------------------------------------------------
# Ciclista
+ pedalar(horas : double) : double
+ calcularTempo(distanciaKm : double) : double
+ apresentar() : String
# Bicicleta
+ trocarMarcha(novaMarcha : int) : String
+ frear() : String
+ descreverBicicleta() : String
# Trilha
+ calcularTempoEstimado(velocidade : double) : double
+ ehLonga() : boolean
+ descreverTrilha() : String
```

## Imagem 3 - Máscaras africanas

### MascarasAfricanas

```
MascarasAfricanas
------------------------------------------------------------
# Máscara
- origem : String
- material : String
- alturaCm : double
# Artesão
- nome : String
- aldeia : String
- anosDeOficio : int
# Exposição
- titulo : String
- numeroMascaras : int
- precoIngresso : double
------------------------------------------------------------
# Máscara
+ descreverMascara() : String
+ ehGrande() : boolean
+ usarEmCerimonia(cerimonia : String) : String
# Artesão
+ esculpir(materialUsado : String) : String
+ ehMestre() : boolean
+ apresentar() : String
# Exposição
+ adicionarMascaras(quantidade : int) : int
+ calcularReceita(visitantes : int) : double
+ descreverExposicao() : String
```

## Imagem 4 - Penteados de mangá

### PenteadosDeManga

```
PenteadosDeManga
------------------------------------------------------------
# Penteado
- nomePenteado : String
- comprimentoCm : double
- estilo : String
# Personagem de mangá
- nomePersonagem : String
- idade : int
- penteado : String
# Desenhista
- nomeDesenhista : String
- quantidadeDesenhos : int
- minutosPorDesenho : double
------------------------------------------------------------
# Penteado
+ cortar(cm : double) : double
+ ehCurto() : boolean
+ descreverPenteado() : String
# Personagem de mangá
+ apresentarPersonagem() : String
+ mudarPenteado(novoPenteado : String) : String
+ envelhecer(anos : int) : int
# Desenhista
+ desenhar(quantidade : int) : int
+ calcularTempoTotal() : double
+ apresentarDesenhista() : String
```
