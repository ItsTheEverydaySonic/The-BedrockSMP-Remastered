tellraw @a {"text":"Milkable players by s5edranner","color":"gold"}

scoreboard objectives add bcount dummy
scoreboard players set #1 bcount 1
execute if score #1 bcount matches 1 run tellraw @a {"text":"variable (bcount) succesfully added","color":"green"}
playsound entity.arrow.hit_player master @a ^ ^ ^