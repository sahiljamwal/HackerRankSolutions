/*
 * Implement a Polygon class with the following properties:
 * 1. A constructor that takes an array of integer side lengths.
 * 2. A 'perimeter' method that returns the sum of the Polygon's side lengths.
 */

class Polygon{
    constructor(sides){
        this.sides=sides;
        this.perimeter=function(){
            let pm=0;
            this.sides.forEach(item => pm+=item);
            return pm;
        }
    }
}
