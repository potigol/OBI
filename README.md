# OBI
Questões da Olimpíada Brasileira de Informática resolvidas usando a [Linguagem Potigol](http://potigol.github.io).

:new: Novo Repositório: https://potigol.github.io/uoj-potigol/competicoes/maratona/

## 2015
[Provas](http://olimpiada.ic.unicamp.br/noticias/gab_fase1_prog)

 - Nível Júnior: [Primeira Fase](./2015/junior/fase1), [Segunda Fase](./2015/junior/fase2)
 - Nível 1: [Primeira Fase](./2015/nivel1/fase1)
 - Nível 2: [Primeira Fase](./2015/nivel2/fase1)
 - Nível Universitário: [Primeira Fase](./2015/universitario/fase1)

## 2014
[Provas](http://olimpiada.ic.unicamp.br/passadas/OBI2014)

 - Nível Júnior: [Primeira Fase](./2014/junior/fase1), [Segunda Fase](./2014/junior/fase2)

<pre>
b <b>=</b> leia_inteiros(" ")<b>[</b>2<b>]</b>
<b>var</b> num <b>:=</b> leia_inteiros(" ").<i>ordene.inverta</i>
<b>var</b> arquivos <b>:=</b> 0

<b>enquanto</b> num.<i>tamanho</i><b> > </b>0 <b>faça</b>
  arquivos<b>:=</b> arquivos <b>+</b> 1
  <b>se</b> num.<i>primeiro</i> <b>+</b> num.<i>último</i><b> <= </b>b <b>então</b>
    num <b>:=</b> num.<i>cauda.pegue</i>(num.<i>tamanho</i> <b>-</b> 2)
  <b>senão</b>
    num <b>:=</b> num.<i>cauda</i>
  <b>fim</b>
<b>fim</b>

<b>escreva</b> arquivos
</pre>
