"use strict";
// never returns anything
function neverReturn() {
    throw new Error('An error');
}
// nullable types
var canBeNUll = 12;
canBeNUll = null;
var canAlsoBeNull;
canAlsoBeNull = null;
var canThisBeAny = null;
canThisBeAny = 12;
