# Foo Bar Quix
Stéphane DESPLAS

### Enoncé backend

Ecrire un algorithme qui transforme une nombre (compris entre 0 et 100) en une chaîne de characters.
Cet algorithme doit suivre les règles suivantes :

<ul>
<li>RDG-001/RDG-004: Si le nombre est divisible par 3 ou s'il contient 3, la chaîne  de characters doit contenir "FOO"</li>
<li>RDG-002/RDG-005: Si le nombre est divisible par 5 ou s'il contient 5, la chaîne  de characters doit contenir "BAR"</li>
<li>RDG-003: Si le nombre contient 7, la chaîne  de characters doit contenir "QUIX"</li>
<li>RDG-006: La règle "divisible par" est plus prioritaire que la règle "contient"</li>
<li>Le contenu est analysé de gauche à droite</li>
<li>RDG-007: Si aucune des règles n'est vérifiée, retourner la nombre en entrée sous forme de chaîne de characters</li>
</ul>


Exemples :

| Input | Output      |
|-------|-------------|
| 1     | "1"         |
| 3     | "FOOFOO"    |
| 5     | "BARBAR"    |
| 7     | "QUIX"      |
| 9     | "FOO"       |
| 51    | "FOOBAR"    |
| 53    | "BARFOO"    |
| 33    | "FOOFOOFOO" |
| 33    | "FOOFOOFOO" |
| 15    | "FOOBARBAR" |

Cet algorithme doit être exposé par un controller rest prenant en entrée le nombre et retournant la chaîne de
characters.
