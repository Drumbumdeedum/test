// never returns anything
function neverReturn(): never {
  throw new Error('An error');
}

// nullable types
let canBeNUll: number | null = 12;
canBeNUll = null;
let canAlsoBeNull;
canAlsoBeNull = null;
let canThisBeAny = null;
canThisBeAny = 12;
