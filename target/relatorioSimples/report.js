$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "line": 1,
  "name": "Consulta",
  "description": "",
  "id": "consulta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2409365300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Consultar Ovo de Páscoa",
  "description": "",
  "id": "consulta;consultar-ovo-de-páscoa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "que acesso a Wikipedia em Portugues",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "pesquiso por \"Ovo de Páscoa\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "exibe a expressao \"Ovo de Páscoa\" no titulo da guia",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.queAcessoAWikipediaEmPortugues()"
});
formatter.result({
  "duration": 2258504200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 14
    }
  ],
  "location": "Post.pesquisoPor(String)"
});
formatter.result({
  "duration": 1573867400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 19
    }
  ],
  "location": "Post.exibeAExpressaoNoTituloDaGuia(String)"
});
formatter.result({
  "duration": 46391700,
  "status": "passed"
});
formatter.after({
  "duration": 732052300,
  "status": "passed"
});
});