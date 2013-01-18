Ext.onReady(function(){
    alert("Test");
    Ext.tip.QuickTipManager.init();

    Ext.define('Kehadiran', {
        extend: 'Ext.data.Model',
        fields: [
            {name: 'peserta',  type: 'string'},
            {name: 'jamMasuk',  type: 'string'},
            {name: 'jamPulang', type: 'int'},
            {name: 'keterangan',  type: 'string'}
        ]
    });

    // create the Data Store
    var store = Ext.create('Ext.data.Store', {
        
        model: 'Kehadiran',
        proxy: {
            type: 'ajax',
            url: 'json',
            reader: {
                type: 'json',
                root: 'data'
            }
        }
    });
    
    var grid = Ext.create('Ext.grid.Panel', {
        width: 700,
        height: 500,
        title: 'Data Kehadiran',
        store: store,
        disableSelection: true,
        loadMask: true,
        // grid columns
        columns:[
        {
            text: "Peserta",
            dataIndex: 'peserta',
            width: 100,
            sortable: true
        },{
            text: "Jam Masuk",
            dataIndex: 'jamMasuk',
            width: 70,
            align: 'right'
        },{
            text: "Jam Pulang",
            dataIndex: 'jamPulang',
            width: 150
        }],
        renderTo: 'gridKehadiran'
    });

    // trigger the data store load
    store.loadPage(1);
});