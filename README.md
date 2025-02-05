# crucigrama-backend
REST API for my [crosswords puzzle generator](https://github.com/m0nt4ld0/crucigrama) project. 

Made with Java 21, Spring Boot and a lots of love 🫶

This API is now available on [Render](https://crucigrama-backend.onrender.com/api/crosswords/getById/1)

## Endpoints

#### Get Crossword By Id
Outputs a JSON of the desired crossword with the following structure

```bash
https://crucigrama-backend.onrender.com/api/crosswords/getById/{crosswordId}
```

### Response example:
For crosswordId = 1 the output is
```json
{
  "vword": "Freud",
  "refs": [
    "Antigua teoría pseudocientífica, hoy sin validez, que afirmaba poder determinar rasgos del cáracter y de la personalidad basándose en la forma del cráneo y las facciones.",
    "Fuerza que durante el análisis «se defiende por todos los medios contra la curación y a toda costa quiere aferrarse a la enfermedad y el padecimiento»",
    "Complejo de...",
    "Fuente de estímulos en constante fluir, procedente de una excitación interna (a diferencia del estímulo que es externo) y está ligada a un objeto, el cual es transitorio. Su satisfacción es parcial.",
    "Proyección, introyección, identificación proyectiva, todos estos son mecanismos de...",
    "Una de las principales figuras intelectuales del siglo XX mejor conocido por ser el padre del Psicoanalisis"
  ],
  "answers": [
    "frenología",
    "resistencia",
    "edipo",
    "pulsión",
    "defensa",
    "freud"
  ]
}
```
