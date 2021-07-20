function eliminar(id) {
	swal({
		title: "Esta Seguro de Eliminar?",
		text: "Desea eliminar un pasajero de la lista?",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((SI) => {
			if (SI) {
				$.ajax({
					url: "/eliminar/" + id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("El pasajero ha sido eliminado satisfactoriamente!", {
					icon: "success",
				}).then((SI) => {
					if (SI) {
						location.href="/listar";
					}
				});
			} else {
				swal("No se elimino ningun pasajero de la lista!");
			}
		});
}
