SECTION .text
global start
start:
mov eax, dword [s]
sub eax, 2
mov dword [b], eax
;----------IF---------
cmp 3, 3
jl Else_label_0
mov dword [a], 2
;----------IF---------
push eax
mov eax, dword [a]
sub eax, 3
cmp eax, 0
pop eax
jg Else_label_1
mov dword [b], 3
Exit_label_1 :
;-------Fin if-------
jump Exit_label_0
Else_label_0 :
;----------IF---------
push eax
mov eax, dword [a]
sub eax, 3
cmp eax, 0
pop eax
jg Else_label_2
mov dword [b], 3
Exit_label_2 :
;-------Fin if-------
Exit_label_0 :
;-------Fin if-------
;----------While---------
While_label_3 :
push eax
mov eax, dword [a]
sub eax, 3
cmp eax, 0
pop eax
jl While_label_3
mov dword [a], 3
SECTION .bss
bbb resb 2
s resb 2
b resb 4
a resb 4
c resb 4
