// never returns anything

function neverReturn(): never {
  throw new Error('An error');
}
