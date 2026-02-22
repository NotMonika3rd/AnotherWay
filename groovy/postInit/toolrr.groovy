var cailiao=["stone","iron","golden","diamond"]
var zhonglei=["sword","pickaxe","axe","shovel","hoe"]

for(cl in cailiao){
    for(zl in zhonglei){
        crafting.removeByOutput(item("minecraft:" + cl + '_' + zl))
    }
}
