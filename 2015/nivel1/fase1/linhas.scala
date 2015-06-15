Aguarde...import br.edu.ifrn.potigol.potigolutil._
import br.edu.ifrn.potigol.Matematica._
/*Codigo: 0 .. 161 */
def merge(left: Lista[Inteiro], right: Lista[Inteiro])= {
  /*Codigo: 14 .. 26 */
var t = Lista(0, 0)
  /*Codigo: 28 .. 34 */
var res = 0
  /*Codigo: 36 .. 48 */
var l = left
var r = right
  /*Codigo: 50 .. 140 */
while (({l!=Lista(List())} && {r!=Lista(List())})) {
  /*Codigo: 70 .. 138 */
1 match {
case _ if ({l.primeiro<=r.primeiro}) => 
  /*Codigo: 84 .. 94 */
def $a1 = {l.primeiro::t};
t = $a1 ;
  /*Codigo: 96 .. 102 */
def $a2 = l.cauda;
l = $a2 ;
case _ => 
  /*Codigo: 106 .. 116 */
def $a3 = {r.primeiro::t};
t = $a3 ;
  /*Codigo: 118 .. 124 */
def $a4 = r.cauda;
r = $a4 ;
  /*Codigo: 126 .. 136 */
def $a5 = {res+l.tamanho};
res = $a5 ;
}
}
  /*Codigo: 142 .. 159 */
`return`(res, {{t.inverta+l}+r})
}
/*Codigo: 163 .. 332 */
def calculate(s: Lista[Inteiro]): ( Int, Lista[Inteiro])= {
  /*Codigo: 186 .. 330 */
1 match {
case _ if ({s.tamanho<2}) => 
  /*Codigo: 198 .. 203 */
(Tupla2(0, s))
case _ => 
  /*Codigo: 207 .. 219 */
val m = {((s.length)).toDouble / 2};
  /*Codigo: 221 .. 233 */
val l = calculate(s.pegue(m));
  /*Codigo: 235 .. 249 */
val l_res = l.primeiro;
val left = l.segundo;
  /*Codigo: 251 .. 263 */
val r = calculate(s.passe(m));
  /*Codigo: 265 .. 279 */
val r_res = r.primeiro;
val right = r.segundo;
  /*Codigo: 281 .. 291 */
val x = merge(left, right);
  /*Codigo: 293 .. 307 */
val res_x = x.primeiro;
val xx = x.segundo;
  /*Codigo: 309 .. 328 */
val res = {{res_l+res_r}+res_x(res, xx)};
}
}
/*Codigo: 334 .. 355 */
val s = Lista(List(1, 5, 3, 4, 6, 2));
/*Codigo: 357 .. 362 */
escreva(calculate(s))
()

import br.edu.ifrn.potigol.potigolutil._
import br.edu.ifrn.potigol.Matematica._
/*Codigo: 0 .. 161 */
def merge(left: Lista[Inteiro], right: Lista[Inteiro])= {
  /*Codigo: 14 .. 26 */
var t = Lista(0, 0)
  /*Codigo: 28 .. 34 */
var res = 0
  /*Codigo: 36 .. 48 */
var l = left
var r = right
  /*Codigo: 50 .. 140 */
while (({l!=Lista(List())} && {r!=Lista(List())})) {
  /*Codigo: 70 .. 138 */
1 match {
case _ if ({l.primeiro<=r.primeiro}) => 
  /*Codigo: 84 .. 94 */
def $a1 = {l.primeiro::t};
t = $a1 ;
  /*Codigo: 96 .. 102 */
def $a2 = l.cauda;
l = $a2 ;
case _ => 
  /*Codigo: 106 .. 116 */
def $a3 = {r.primeiro::t};
t = $a3 ;
  /*Codigo: 118 .. 124 */
def $a4 = r.cauda;
r = $a4 ;
  /*Codigo: 126 .. 136 */
def $a5 = {res+l.tamanho};
res = $a5 ;
}
}
  /*Codigo: 142 .. 159 */
`return`(res, {{t.inverta+l}+r})
}
/*Codigo: 163 .. 332 */
def calculate(s: Lista[Inteiro]): ( Int, Lista[Inteiro])= {
  /*Codigo: 186 .. 330 */
1 match {
case _ if ({s.tamanho<2}) => 
  /*Codigo: 198 .. 203 */
(Tupla2(0, s))
case _ => 
  /*Codigo: 207 .. 219 */
val m = {((s.length)).toDouble / 2};
  /*Codigo: 221 .. 233 */
val l = calculate(s.pegue(m));
  /*Codigo: 235 .. 249 */
val l_res = l.primeiro;
val left = l.segundo;
  /*Codigo: 251 .. 263 */
val r = calculate(s.passe(m));
  /*Codigo: 265 .. 279 */
val r_res = r.primeiro;
val right = r.segundo;
  /*Codigo: 281 .. 291 */
val x = merge(left, right);
  /*Codigo: 293 .. 307 */
val res_x = x.primeiro;
val xx = x.segundo;
  /*Codigo: 309 .. 328 */
val res = {{res_l+res_r}+res_x(res, xx)};
}
}
/*Codigo: 334 .. 355 */
val s = Lista(List(1, 5, 3, 4, 6, 2));
/*Codigo: 357 .. 362 */
escreva(calculate(s))
()
 - Compiler exception error: line 36: not found: value return
`return`(res, {{t.inverta+l}+r})
^
error: line 44: type mismatch;
 found   : br.edu.ifrn.potigol.potigolutil.Tupla2[Int,br.edu.ifrn.potigol.potigolutil.Lista[br.edu.ifrn.potigol.potigolutil.Inteiro]]
    (which expands to)  br.edu.ifrn.potigol.potigolutil.Tupla2[Int,br.edu.ifrn.potigol.potigolutil.Lista[Int]]
 required: (Int, br.edu.ifrn.potigol.potigolutil.Lista[br.edu.ifrn.potigol.potigolutil.Inteiro])
    (which expands to)  (Int, br.edu.ifrn.potigol.potigolutil.Lista[Int])
(Tupla2(0, s))
       ^
error: line 49: type mismatch;
 found   : Double
 required: br.edu.ifrn.potigol.potigolutil.Inteiro
    (which expands to)  Int
val l = calculate(s.pegue(m));
                          ^
error: line 51: value primeiro is not a member of (Int, br.edu.ifrn.potigol.potigolutil.Lista[br.edu.ifrn.potigol.potigolutil.Inteiro])
val l_res = l.primeiro;
              ^
error: line 52: value segundo is not a member of (Int, br.edu.ifrn.potigol.potigolutil.Lista[br.edu.ifrn.potigol.potigolutil.Inteiro])
val left = l.segundo;
             ^
error: line 54: type mismatch;
 found   : Double
 required: br.edu.ifrn.potigol.potigolutil.Inteiro
    (which expands to)  Int
val r = calculate(s.passe(m));
                          ^
error: line 56: value primeiro is not a member of (Int, br.edu.ifrn.potigol.potigolutil.Lista[br.edu.ifrn.potigol.potigolutil.Inteiro])
val r_res = r.primeiro;
              ^
error: line 57: value segundo is not a member of (Int, br.edu.ifrn.potigol.potigolutil.Lista[br.edu.ifrn.potigol.potigolutil.Inteiro])
val right = r.segundo;
              ^
error: line 64: not found: value res_l
val res = {{res_l+res_r}+res_x(res, xx)};
            ^
error: line 64: not found: value res_r
val res = {{res_l+res_r}+res_x(res, xx)};
                  ^
error: line 45: type mismatch;
 found   : Unit
 required: (Int, br.edu.ifrn.potigol.potigolutil.Lista[br.edu.ifrn.potigol.potigolutil.Inteiro])
    (which expands to)  (Int, br.edu.ifrn.potigol.potigolutil.Lista[Int])
case _ => 
       ^
linha: 36
