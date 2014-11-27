window.Popup = function(options){
    this._settings = {
        popupId : 'popup',
        popupTitle : '',
        width: 500,
        popupMove: true,
        popupBackground : true,
        popup_zindex : 20,
        _popupBackgroundId : 'popup_bg',
        reload : false,
        popupHtml : ''
    };

    for (var i in options) {
        if (options.hasOwnProperty(i)){
            this._settings[i] = options[i];
        }
    }
};
window.Popup.prototype = {
    openPopup : function(html, id, background){
        var id = this._settings.popupId;
        var width = this._settings.width;
        var bgBody = this._settings.popupBackground;
        var title = this._settings.popupTitle;
        var move = this._settings.popupMove;
        var zindex = this._settings.popup_zindex;
        var reload = this._settings.reload;
        var html = this._settings.popupHtml;
        var callback = this._settings.callback;
        
        var center = false;
        
        if(bgBody) this._addBackground();
        if($("#"+id) && reload){
            $("#"+id).remove();
        }
        if($('#'+id).size()==0){
            $('<div id="'+id+'" class="layerpopup" style="width:'+width+'px;z-index:'+zindex+'"><div class="layerpopup-inner"><div class="layerpopup-innerHtml"><div class="layerpopup-inner"><div><h1>'+title+'</h1></div><div class="layerpopup-contents"></div></div><a href="javascript:new Popup().closePopup(\''+id+'\')" class="close">close</a></div></div>').appendTo(document.body);
            center = true;
        }
        $("#"+id + " .layerpopup-contents").html(html);
        

        
        if(move) $("#"+id).draggable();
        var doc = document.documentElement, body = document.body;
        if(center){
            $("#"+id).css("left", body.clientWidth/2 - width/2);
            $("#"+id).css("top", (doc.clientHeight/2)+(doc.scrollTop+body.scrollTop) - $(".layerpopup").height()/2).show();
        }

        if(callback) callback();
    },

    closePopup : function(id){
        var id;
        if(!id){
            id = this._settings.popupId;
        }
        this._removeBackground();
        $("#"+id).remove();
        var backgroundId = this._settings._popupBackgroundId;
        if(backgroundId && $('#'+backgroundId).size()>0){
            $('#'+backgroundId).remove();
        }

    },

    _addBackground: function(){ 
        var body = document.body;
        var backgroundId = this._settings._popupBackgroundId;
        if($('#'+backgroundId).size()>0){
            $('#'+backgroundId).addClass("layerpopup-background");
        }else {
            $('<div id="'+backgroundId+'" class="layerpopup-background" style=""></div>').appendTo(document.body);
        } 
        $('#'+backgroundId).width(0);
        $('#'+backgroundId).height(0);
        $('#'+backgroundId).width(body.clientWidth);
        $('#'+backgroundId).height(body.clientHeight);
    },
    _removeBackground : function(){ 
        var backgroundId = this._settings._popupBackgroundId;
        if($(".layerpopup").size() == 1)
            $('#'+backgroundId).removeClass("layerpopup-background");
    } 
};