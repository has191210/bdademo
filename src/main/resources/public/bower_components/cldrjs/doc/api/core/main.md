## .main( path )

It's an alias for `.get([ "main/{languageId}", ... ])`.

| Parameter | Type | Exampe |
| --- | --- | --- |
| *path* | String or<br>Array | See `cldr.get()` for more information |

```javascript
ptBr.main( "numbers/symbols-numberSystem-latn/decimal" );
// ➡ ","
```
