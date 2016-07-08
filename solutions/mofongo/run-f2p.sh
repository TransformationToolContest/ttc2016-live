#!/bin/bash

export PYTHONPATH=.
EXDIR=/home/antonio/Documents/ttc2016-live-contest/examples/eu.ttc.dataflow.examples.families2persons

python \
    test/test_flowm2m.py \
    "$EXDIR/transformation/families2persons.dataflow" \
    Families "$EXDIR/input/familyGL.model" "$EXDIR/metamodels/Families.ecore" \
    Persons /tmp/persons.model "$EXDIR/metamodels/Persons.ecore"
