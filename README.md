# OBI
Questões da Olimpíada Brasileira de Informática resolvidas usando a [Linguagem Potigol](http://potigol.github.io).

## 2015
 - Nível Júnior: [Primeira Fase](./2015/junior/fase1)
 - Nível 1: [Primeira Fase](./2015/nivel1/fase1)
 - Nível 2: [Primeira Fase](./2015/nivel2/fase1)
 - Nível Universitário: [Primeira Fase](./2015/universitario/fase1)

   
```python
b = leia_inteiros(" ")[2]
var num := leia_inteiros(" ").ordene.inverta
var arquivos := 0

enquanto num.tamanho > 0 faça
  arquivos:= arquivos + 1
  se num.primeiro + num.último <= b então
    num := num.cauda.pegue(num.tamanho - 2) 
  senão
    num := num.cauda
  fim
fim

escreva arquivos
```
