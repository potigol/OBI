# OBI
Questões da Olimpíada Brasileira de Informática resolvidas usando a [Linguagem Potigol](http://potigol.github.io).

## 2015
[Provas](http://olimpiada.ic.unicamp.br/noticias/gab_fase1_prog)

 - Nível Júnior: [Primeira Fase](./2015/junior/fase1)
 - Nível 1: [Primeira Fase](./2015/nivel1/fase1)
 - Nível 2: [Primeira Fase](./2015/nivel2/fase1)
 - Nível Universitário: [Primeira Fase](./2015/universitario/fase1)

<pre>
b = leia_inteiros(" ")[2]
<b>var</b> num := leia_inteiros(" ").<i>ordene.inverta</i>
<b>var</b> arquivos := 0

<b>enquanto</b> num.<i>tamanho</i> > 0 <b>faça</b>
  arquivos:= arquivos + 1
  <b>se</b> num.<i>primeiro</i> + num.<i>último</i> <= b <b>então</b>
    num := num.<i>cauda.pegue</i>(num.<i>tamanho</i> - 2) 
  <b>senão</b>
    num := num.<i>cauda</i>
  <b>fim</b>
<b>fim</b>

<b>escreva</b> arquivos
</pre>
