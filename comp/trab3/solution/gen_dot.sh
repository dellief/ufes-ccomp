#!/bin/bash

DATA=/home/dellief/ufes-ccomp/comp/trab3
IN=$DATA/in
OUT=$DATA/outTest

EXE=./trab3

for infile in `ls $IN/*.cm`; do
    base=$(basename $infile)
    dotfile=$OUT/${base/.cm/.dot}
    pdffile=$OUT/${base/.cm/.pdf}
    $EXE < $infile > $dotfile
    dot -Tpdf $dotfile -o $pdffile
done
