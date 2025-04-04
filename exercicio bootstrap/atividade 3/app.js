document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('contatoForm');
  
    form.addEventListener('submit', function (event) {
      event.preventDefault();
      event.stopPropagation();
  
      if (form.checkValidity()) {
        alert("Mensagem enviada com sucesso!");
        form.reset();
        form.classList.remove('was-validated');
      } else {
        form.classList.add('was-validated');
      }
    });
  });
  